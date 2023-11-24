
// a class can implement multiple interfaces
//  here is an example 
interface A {
    // every variable in interface are by default final and static
    int age = 44;
    String area = "something";// final and static we can directly use interface variables

    void show();

    void config();
}

interface X {
    void run();
}

// can interface extend another interface how do we do that
interface Y extends X {

}

class B implements A, X {

    public void config() {
        System.out.println("in show");

    }

    public void show() {
        System.out.println("in config");

    }

    public void run() {
        System.out.println("x is running...");
    }

}

public class Interfaces_02 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        // obj.run();// this will not work because we are creating refrence of a and a
        // has no idea what run method is // so take care of it
        X obj1 = new B();
        obj1.run();
        // obj1.config() // x has no idea what config is
    }
}
