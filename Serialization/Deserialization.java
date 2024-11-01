package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            User a;

            try (FileInputStream fileIn = new FileInputStream("../UserInfo.ser");
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                 a = (User) in.readObject();
                 in.close();
                 System.out.println(a);
                System.out.println("Obj info saved! :)");
            }
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
