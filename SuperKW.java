class Points {
  private float x, y;

  Points() {
    this(0, 0);
  }

  Points(float x, float y) {
    this.x = x;
    this.y = y;
  }

  // Getters for x and y
  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }
}

class Gauss extends Points {
  Gauss(float x, float y) {
    super(x, y);
  }

  Gauss(Points P) {
    super(P.getX(), P.getY());
  }

  Gauss(Cartesian P) {
    super(P.getX(), P.getY());
  }

  void display() {
    System.out
        .println(String.format("G(%.2f %s i%.2f)", getX(), (getY() >= 0 ? "+" : "-"), java.lang.Math.abs(getY())));
  }
}

class Cartesian extends Points {
  Cartesian(float x, float y) {
    super(x, y);
  }

  Cartesian(Points P) {
    super(P.getX(), P.getY());
  }

  Cartesian(Gauss P) {
    super(P.getX(), P.getY());
  }

  void display() {
    System.out.printf("C(%.2f, %.2f)%n", getX(), getY());
  }
}

public class SuperKW {
  public static void main(String[] args) {
    Gauss g1 = new Gauss(3.12f, -4);
    g1.display();

    Cartesian c1 = new Cartesian(g1);
    c1.display();
  }
}
