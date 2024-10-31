import java.lang.Math;

class Points {
  public double x, y;

  Points() {
    this.x = 0;
    this.y = 0;
  }

  Points(double a, double b) {
    this.x = a;
    this.y = b;
  }

  Points(Points Other) {
    this.x = Other.x;
    this.y = Other.y;
  }

  @Override
  public String toString() {
    return String.format("{\n\tx : %.2f,\n\ty : %.2f\n}", this.x, this.y);
  }
}

public class ArrayOfObjects {

  static double distance(Points p1, Points p2) {
    return (Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y)));
  }

  public static void main(String[] args) {
    Points[] pointsArray = { new Points(), new Points(2, 3), new Points(new Points(4, 1)), new Points(2.2, 2.1) };

    for (int i = 1; i < pointsArray.length; ++i) {
      System.out.printf("{%.2f, %.2f}, {%.2f, %.2f} : %.4f units\n", pointsArray[i - 1].x, pointsArray[i - 1].y,
          pointsArray[i].x, pointsArray[i].y,
          distance(pointsArray[i], pointsArray[i - 1]));
    }
  }
}
