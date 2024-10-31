public class FormatSpecifiers {
  public static void main(String[] args) {

    // ----------------[conversion-character]----------------
    int a = 90;
    char c = (char) a;
    float b = .000001f;
    System.out.printf("a as Boolean value  -->  %b\n", a);
    System.out.printf("a as an Octal value  -->  %o\n", a);
    System.out.printf("a as Decimal value  -->  %d\n", a);
    System.out.printf("a as Hexadecimal value  -->  %X\n", a);
    System.out.printf("b as Float value --> %f\n", b);
    System.out.printf("b as sci notation value  -->  %e\n", b);
    System.out.printf("c as Character value  -->  %c\n", c);

    // ----------------[width]----------------
    String name = "Naman";
    System.out.printf("name  -->  %10s\n", name);

    // ----------------[precision]----------------
    double m_pi = java.lang.Math.PI;
    System.out.printf("PI  -->  %.3f\n", m_pi);

    // ----------------[flags]----------------
    /*
     * - --> left justify
     * 
     */
    System.out.printf("PI  -->  %-10f\n", m_pi);
    System.out.printf("PI  -->  %010f\n", m_pi);
    System.out.printf("100000000  -->  %,d\n", 100000000);

  }
}
