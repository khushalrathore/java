
import java.util.ArrayList;
import java.util.List;

public class ArrayLists2D {
  public static void main(String[] args) {
    int i = 0;
    ArrayList<List<String>> table = new ArrayList<>();
    table.add(List.of("Sr.", "Name", "Mobile", "Email"));
    table.add(List.of(Integer.toString(++i), "Khushal", "8290120121", "amme@fm.com"));
    table.add(List.of(Integer.toString(++i), "Arjun", "8290192023", "adam@ij.com"));
    table.add(List.of(Integer.toString(++i), "Naman", "8290192023", "kdhm@qq.me"));

    for (List<String> el : table) {
      System.out.println(el);
    }
  }
}
