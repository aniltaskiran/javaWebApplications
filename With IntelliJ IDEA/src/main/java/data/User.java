package data;

public class User {
    private String name;
    private String email;

    public User(String n, String e) {
        name = n;
        email = e;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}

