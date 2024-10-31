package OOPS;

public class InterfaceDemo implements Interface  {
    public void something(){
            System.out.println("Something");
        }
    public void otherthing(){
            System.out.println("Otherthing");
        }
    public static void main(String[] args) {
        InterfaceDemo iD = new InterfaceDemo();
        iD.something();
        iD.otherthing();
    }
}

