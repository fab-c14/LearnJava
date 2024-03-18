class Counter {
    public int count = 0;

    public synchronized void increment() {// we can use synchronized to solve this problem if t1 is incrementing then t2
                                          // should not be allowed to increment
        count += 1;
    }
}

public class Race_Condition_threads {
    public static void main(String[] args) throws InterruptedException {
        // threads
        // mutation - we can change something, primitive data types
        // strings are immutable
        // suppose you have two threads t1 changes value of variable and t2 also changes
        //
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                // System.out.println("hello");
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                // System.out.println("hi");
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // System.out.println(c.count); // it should be 2000
        t1.join();
        t2.join();// now with join it will work
        System.out.println(c.count);// still you willl not get 2000, when executing multiple times you will get
                                    // different results

    }
}
