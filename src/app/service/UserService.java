package app.service;

import app.repository.Repository;
import app.entity.User;

import java.util.Scanner;
import static java.lang.System.*;

public class UserService {

    private Scanner scanner;
    private Repository userRepo;
    private Long lastId = 1L;

    public UserService(Scanner scanner) {
        this.scanner = scanner;
        this.userRepo = Repository.get("user");
    }

    public User register(){

        out.print("Введите имя: ");
        String name = scanner.nextLine();

        out.print("Введите пароль: ");
        String pass = scanner.nextLine();

        User user = new User(lastId++, name, pass );
        userRepo.save(user);

        out.println("Вы зарегистрированы");
        return user;
    }

    public void login(){
        out.print("Введите имя: ");
        String name = scanner.nextLine();

        out.print("Введите пароль: ");
        String pass = scanner.nextLine();

        if(pass.equals(userRepo.find(name))){
            out.println("Вы вошли в свой аккаунт");
        } else {
            err.println("Неверный логин или пароль");
        }

    }
}
