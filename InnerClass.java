class A {
    int age;

    public void show() {
        System.out.println("in a show");
    }

    // we can also make this class static
    static class B {
        int age;

        public void config() {
            System.out.println("in b config");
        }
    }
}

public class InnerClass {
    public static void main(String args[]) {
        // how to call config
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();

        // creating object of b with object of a

        // A.B obj1 = obj.new B();
        // obj1.config();

        // when b is static class
        A.B obj2 = new A.B();
        obj2.config();

        // anonymous inner class
        A obj3 = new A() {
            public void show() {
                System.out.println("in new Show");
            }
        };
        obj3.show();
    }
}
