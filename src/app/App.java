package app;

import app.service.UserService;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService(scanner);

        while (true) {
            String command = scanner.nextLine();

            switch (command) {
                case "log":
                    userService.login();
                    break;
                case "reg":
                    userService.register();
                    break;
                default:
                    System.out.println("don`t have this command!");
            }
        }
    }
}
