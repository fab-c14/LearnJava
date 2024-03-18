class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class B implements Runnable { // instead of extending with thread class we implemented runnable interface
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");

        }
    }
}

public class Threads_03 {
    public static void main(String[] args) {
        // Runnable vs Thread

        // Runnable obj1 = new A();
        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }

        };

        // Runnable obj2 = new B();
        Runnable obj2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        };

        // obj1.start(); // by implementing runnable instead of Exetending thread, start
        // will not work

        // obj2.start();
        // what we can do is

        Thread t1 = new Thread(obj1);// creating a thread objects
        Thread t2 = new Thread(obj2);// thread class constructor takes a runnable class object

        t1.start();
        t2.start();
    }
}
