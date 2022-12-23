package app.repository;

import app.entity.User;

import java.io.IOException;
import java.io.RandomAccessFile;

import static java.lang.String.valueOf;

public class Repo {
    private final String database;
    private final Integer[] fieldSizes;

    public Repo(String table, Integer... fieldSizes) {
        this.database  = "res/database/" + table;
        this.fieldSizes = fieldSizes;
    }

    public void save(User user) {
        try (RandomAccessFile editor = new RandomAccessFile(database, "rw")) {
            editor.seek(editor.length());
            editor.writeBytes(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String find(int fieldIndex) {
        byte[] buff = new byte[fieldSizes[fieldIndex+1] - fieldSizes[fieldIndex]];

        try (RandomAccessFile editor = new RandomAccessFile(database, "rw")) {
            editor.seek(fieldSizes[fieldIndex]);
            editor.read(buff);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buff);
    }
}

class RepoTest {
    private static User jami = new User(1L, "Jami", "098");
    private static User mady = new User(2L, "Mady", "098");
    private static User said = new User(3L, "Said", "098");
    private static User kara = new User(4L, "Kara", "098");

    public static void main(String[] args) {
        Repo repo = new Repo("table", 0, 20, 50, 80);

//        repo.save(jami);
//        repo.save(mady);
//        repo.save(said);
//        repo.save(kara);

        System.out.println(repo.find(1));
    }
}