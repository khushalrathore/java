package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {
    private String name, password;

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    User(User other) {
        this.name = other.name;
        this.password = other.password;
    }

    void clear() {
        this.name = null;
        this.password = null;
    }

    void greet() {
        System.out.printf("Hello, %s\n", this.name != null ? this.name : "Guest");
    }

    @Override
    public String toString() {
        return String.format("{name : %s, password : %s}", this.name, this.password);
    }
}

public class Serialization {
    public static void main(String[] args) {
        try {
            User a = new User("Khushal", "Nobody");
            User b = new User(a);

            try (FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(a);
                System.out.println("Obj info saved! :)");
            }

            System.out.println(a.toString());
            System.out.println(b.toString());

            a.greet();
            a.clear();
            a.greet();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
