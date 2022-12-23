package app.entity;

public class User {

    private Long id;
    private String firstName;
    private String password;

    public User() {
    }

    public User(Long id, String firstName, String password){
        this.id = id;
        this.firstName = firstName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
