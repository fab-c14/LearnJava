class A {
    public void show() {
        System.out.println("In A Show...");
    }

    public void config() {
        System.out.println("In A Config");
    }
}

class B extends A {
    // overriding show method
    public void show() {
        System.out.println("In B Show...");
    }
}

public class Overriding {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        B obj = new B();
        obj.show();
        obj.config();
    }
}
