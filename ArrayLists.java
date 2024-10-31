import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("peach");

    for (int i = 0; i < fruits.size(); ++i) {
      System.out.println(i + " : " + fruits.get(i));
    }

    fruits.set(0, "papaya");
    fruits.remove(fruits.size() - 1);
    System.out.println(fruits);
    fruits.clear();
    System.out.println(fruits);
  }
}
