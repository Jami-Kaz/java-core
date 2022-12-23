package app.repository;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.*;
import static java.lang.String.format;

public class Repository {
    private static final String DB = "res/database/";
    private PrintStream printer;
    private Scanner scanner;
    private Path pathDB;

    private static Map<String, Repository> repos = new HashMap<>();


    private Repository(String table) {
        pathDB = Paths.get(DB + table);

        try {
            if (!Files.exists(pathDB)) {
                Files.createFile(pathDB);
            }
            printer = new PrintStream(
                    new FileOutputStream(pathDB.toFile(), true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Repository get(String table) {
        if (!repos.containsKey(table)) {
            repos.put(table, new Repository(table));
        }
        return repos.get(table);
    }



    public void save(Object entity) {
        printer.print(entity);
    }

    public String find(Long id) {
        setScanner();
        return scanner.findWithinHorizon(format("(?<=(%s )).*", id), MAX_VALUE);
    }

    public String find(String firstName) {
        setScanner();
        return scanner
                .findWithinHorizon(format("(?<=(firstName: %s password: ))\\S+", firstName), MAX_VALUE);
    }

    public String find(Long id, Object field) {
        return new Scanner(find(id))
                .findWithinHorizon(format("(?<=(%s: ))\\S+", field), MAX_VALUE);
    }

    public void update(Object id, Object entity) {
        try {
            Files.write(pathDB,
                    new String(Files.readAllBytes(pathDB))
                            .replaceFirst(format("\nid: %s .*", id), entity.toString())
                            .getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(Object id) {
        update(id, "");
    }



    private void setScanner() {
        try {
            scanner = new Scanner(pathDB);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

