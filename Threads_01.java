class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread { // by extending with thread its not a normal class. its a thread now
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");
        }
    }
}

public class Threads_01 {
    public static void main(String[] args) {
        // Threads -> when you run an app, it will be running on os and below os there
        // will be a hardware, on os there will be multiple softwares running...
        // we will have multiple softwares, so they should work at a same time,
        // modern os support that,
        // multiple threads -> creating threads
        // most of times threads are created by frameworks, threads will not be created
        // by you most of times

        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();
        // obj2.show();
        // we have to class start method

        obj1.start(); // start calls run method so change show method to run method
        obj2.start();

    }
}