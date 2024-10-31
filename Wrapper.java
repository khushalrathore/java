public class Wrapper {

  public static class IntWrapper {
    public int value;

    public IntWrapper(int val) {
      this.value = val;
    }
  }

  public static void primitiveIncrementor(int a) {
    a += 1;
  }

  public static void customIncrementor(IntWrapper a) {
    a.value += 1;
  }

  public static void wrapperIncrementor(Integer a) {
    a += 1;
  }

  public static void main(String[] args) {
    // wrapper class is a way to use a primitive data as a reference data type
    int a = 5;
    System.out.println(a); // 5
    primitiveIncrementor(a);
    System.out.println(a); // 5

    Integer b = 5;
    System.out.println(b); // 5
    wrapperIncrementor(b);
    System.out.println(b); // 5

    IntWrapper c = new IntWrapper(5);
    System.out.println(c.value); // 5
    customIncrementor(c);
    System.out.println(c.value); // 6

    System.out.println(b.byteValue());

  }
}
