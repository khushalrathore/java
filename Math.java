public class Math {
  public static void showExample(){
    double x = java.lang.Math.pow(8, 2) + 1;
      double y = 2.71828;
      System.out.println(java.lang.Math.min(x, y));
      System.out.println(java.lang.Math.round(java.lang.Math.sqrt(x)));
  }
  
  public double hypotenuse(double base, double height){
    double hy = java.lang.Math.sqrt(java.lang.Math.pow(base, 2) + java.lang.Math.pow(height, 2));
    return hy;
  }
  public static void main(String[] args) {
      // showExample();
      System.out.println(new Math().hypotenuse(30, 40));

      /* 
        showExample() was static i.e.
        in the Math(this file's name) namespace hence no need 
        for accessing it using an obj like hypotenuse'
      */
  }
}
