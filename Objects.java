public class Objects {
    class Point {
        private float x, y;

        Point() {
            this.x = 0;
            this.y = 0;
            System.out.println("Default Constructor Called");
        }

        Point(Point other) {
            this.x = other.x;
            this.y = other.y;
            System.out.println("Copy Constructor Called");
        }


        Point(float a, float b) {
            this.x = a;
            this.y = b;
            System.out.println("Parameterized Constructor Called");
        }

        float getX() { return x; }
        float getY() { return y; }

        void print() {
            System.out.println(x + ", " + y);
        }

        String distanceFromOrigin() {
            float result = (float) java.lang.Math.sqrt(x * x + y * y);
            return result + " units";
        }
    }

    public static void main(String[] args) {
        Objects obj = new Objects();
        Point p = obj.new Point(1.21F, 2.12F);
        p.print();
        System.out.println(p.distanceFromOrigin());
        Point pCopy = obj.new Point(p);
        pCopy.print();
    }
}
