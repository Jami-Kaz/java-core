package app.repository;

import app.entity.User;

public class RepoConfTest {
    private static Repository repository = Repository.get("user");;
    private static User jami = new User(1L, "Jami", "098");
    private static User mady = new User(2L, "Mady", "098");
    private static User said = new User(3L, "Said", "098");
    private static User kara = new User(4L, "Kara", "098");

    public static void main(String[] args) {
//        appendTest();
//        findTest();
//        findFieldTest();
//        updateTest();
//        deleteTest();
        findPassTest();
    }

    static void appendTest() {
        repository.save(jami);
        repository.save(mady);
        repository.save(said);
        repository.save(kara);
    }

    static void findTest(){
        System.out.println(repository.find(1L));
        System.out.println(repository.find(2L));
        System.out.println(repository.find(3L));
        System.out.println(repository.find(4L));
    }

    static void findPassTest(){
        System.out.println(repository.find("Jami"));
        System.out.println(repository.find("Mady"));
        System.out.println(repository.find("Said"));
        System.out.println(repository.find("Kara"));
    }

    static void findFieldTest(){
        System.out.println(repository.find(1L, "password"));
        System.out.println(repository.find(2L, "firstName"));
        System.out.println(repository.find(3L, "password"));
        System.out.println(repository.find(4L, "firstName"));
    }

    static void updateTest(){
        repository.update(jami.getId().toString(), jami);
        repository.update(mady.getId().toString(), mady);
        repository.update(said.getId().toString(), said);
        repository.update(kara.getId().toString(), kara);
    }

    static void deleteTest(){
        repository.delete("1");
        repository.delete("2");
        repository.delete("3");
        repository.delete("4");
    }
}
