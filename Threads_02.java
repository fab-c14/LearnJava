class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } // sleep for 100 ms or wait for 100ms and then continue
        }
    }
}

class B extends Thread { // by extending with thread its not a normal class. its a thread now
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           
        }
    }
}

public class Threads_02 {
    public static void main(String[] args) throws InterruptedException {
        // thread priority and slee
        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj1.getPriority()); // 1 means less priority and 10 means
        // highest,and 5 is default
        // System.out.println(obj1.getPriority());
        // // we can alos set priority
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj2.getPriority());
        obj1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        obj2.start();
        // obj1.join();
        // obj2.join();

    }
}
