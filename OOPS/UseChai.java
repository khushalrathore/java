package OOPS;

public class UseChai {
  public static void main(String[] args) {
    Chai chai1 = new Chai("Masala", 75, false);
    Chai chai2 = new Chai(chai1);
    chai2.setTemperature(50);

    System.out.println(chai1);
    System.out.println(chai2);
  }
}
