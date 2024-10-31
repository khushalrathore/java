package OOPS;

public class Inheritance {

    public static class Door {
        public void open() {
            System.out.println("Door Opened");
        }
    }

    public static class BankVault extends Door {
        public void close() {
            System.out.println("Vault Closed");
        }
    }

    public static void main(String[] args) {
        BankVault myVault = new BankVault();
        myVault.open();
        myVault.close();
    }
}