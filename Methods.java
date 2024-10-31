public class Methods {
  public static void main(String[] args) {
    Methods caller = new Methods();
    hello("User");

    caller.bye("User");

    String[] names = { "Khushal", "Arjun", "Kartikey", "Harsh" };

    for (String name : names)
      hello(name);

  }

  static void hello(String name) {
    System.out.println((name.length() > 1) ? ("Hello, " + name) : ("Hello"));
  }

  void bye(String name) {
    System.out.println("Bye, " + name);
  }
}
