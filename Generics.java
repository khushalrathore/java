public class Generics {
    public static class GenrPrint<T>{
        T thingToPrint;
        GenrPrint(T item){
            this.thingToPrint = item;
        }
        public void print(){
            System.out.println(thingToPrint);
        }
    }
    public static void main(String[] args) {
        GenrPrint<Integer> i = new GenrPrint<>((int)java.lang.Math.signum(-100000));
        GenrPrint<Double> d = new GenrPrint<>(java.lang.Math.PI);
        GenrPrint<String> s = new GenrPrint<>("Khushal");
        i.print();
        d.print();
        s.print();
    }
}
