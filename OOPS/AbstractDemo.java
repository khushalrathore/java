package OOPS;

class MyClass extends AbstractClass {
    @Override
    void absMethod() {
        System.out.println("It has to be implemented");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.concreteMethod();
        obj.absMethod();
    }
}
