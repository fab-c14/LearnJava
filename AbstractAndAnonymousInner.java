abstract class A {
    public abstract void show();

    public abstract void config();
}

class B extends A {

    public void show() {
        System.out.println("in B Show");
    }

    public void config() {
        System.out.println("in B Show");
    }
}

public class AbstractAndAnonymousInner {
    public static void main(String[] args) {
        // using anonymous inner class to impliment abstract method.

        A obj = new A() {
            public void show() {
                System.out.println("i A show.");
            }

            public void config() {
                System.out.println("in a config");
            }
        };
        obj.show();
    }
}
