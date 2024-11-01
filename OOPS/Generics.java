
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
class GenClass<T>{
  private final T item;
  GenClass(T a){
    this.item = a;
  }
  T getItem(){
    return this.item;
  }
  @Override
  public String toString(){
    return String.format("Item : %s", this.item);
  }
}
public class Generics{
  public static <T> void genPrint(ArrayList<T> array){
    for(int i=0;i<array.size();++i){
      System.out.print((i!=array.size()-1) ? (array.get(i)+", ") : (array.get(i)+"\n"));
    }
  }
  public static <T> T getRandom(ArrayList<T> array){
    return array.get(new Random().nextInt(0,array.size()));
  }
  public static void main(String[] args) {
    ArrayList<Integer> ints = new ArrayList<>();
    ArrayList<String> strs = new ArrayList<>();
    ints.addAll(List.of(1,2,3,4,5));
    strs.addAll(List.of("Khushal","Arjun","Harsh","Kartikey"));
    genPrint(ints);
    genPrint(strs);
    System.out.println(getRandom(ints));
    System.out.println(getRandom(strs));

    GenClass itemInt = new GenClass<>(1);
    GenClass itemFloat = new GenClass<>(1.12f);
    GenClass itemString = new GenClass<>("Khushal");
    System.out.println(itemInt.toString());
    System.out.println(itemFloat.toString());
    System.out.println(itemString.toString());
    System.out.println(itemString.getItem());
  }
}