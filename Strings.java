public class Strings {

  public static void main(String[] args) {
    String a = "Khushal Rathore";
    String b = "khushal rathore";
    String c = " ";
    System.out.println(a.length()); // 15
    System.out.println(a.equals(b)); // false
    System.out.println(a.equalsIgnoreCase(b)); // true
    System.out.println(a.endsWith("e")); // true
    System.out.println(Character.toUpperCase((a.charAt(420 % 69)))); // L
    System.out.println((a.indexOf("a"))); // 5
    System.out.println((a.lastIndexOf("a"))); // 9
    System.out.println(c.isEmpty()); // false
    System.out.println(c.isBlank()); // true
    System.out.println(a.toUpperCase()); // KHUSHAL RATHORE
    System.out.println(a.toLowerCase()); // khushal rathore
    System.out.println(((a.replaceAll(" ", "")).toLowerCase())); // khushalrathore
  }
}
