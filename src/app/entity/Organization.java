package app.entity;

public class Organization {
    private String name;
    private User[] users;
    private Integer usersCount = 0;

    public Organization(String name, int capacity){
        this.name = name;
        this.users = new User[capacity];
    }

    public void addUser(User user){
        users[usersCount++] = user;
    }
}
