import java.util.ArrayList;

class Friend {
  static int numberOfFriends = 0;
  private final String name;
  private static final ArrayList<String> friends = new ArrayList<>();

  Friend(String name) {
    numberOfFriends++;
    this.name = name;
    friends.add(this.name);
  }

  @Override
  public String toString() {
    return String.format("%s", this.name);
  }

  static void listAll() {
    for (int i = 0; i < friends.size(); ++i) {
      System.out.print((i != friends.size() - 1) ? friends.get(i) + ", " : friends.get(i));
    }
    System.out.println();
  }
}

public class StaticKW {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    System.out.println(Friend.numberOfFriends); // 0 (friends -> 0)

    Friend first = new Friend("Arjun");
    System.out.println(Friend.numberOfFriends); // 1 (friends -> Arjun)

    Friend second = new Friend("Harsh");
    System.out.println(Friend.numberOfFriends); // 2 (friends -> Arjun, Harsh)

    Friend third = new Friend("Kartikey");
    System.out.println(Friend.numberOfFriends); // 3 (friends -> Arjun, Harsh, Kartikey)

    Friend fourth = new Friend("Yash");
    System.out.println(Friend.numberOfFriends); // 4 (friends -> Arjun, Harsh, Kartikey, Yash)

    Friend.listAll();
  }
}
