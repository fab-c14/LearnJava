class Entry{
    private int count = 0;
    public synchronized void increment(){
        count++;
    }
    public synchronized int getCount(){
        return count;
    }
}
public class Threads_05 {
    public static void main(String[] args) throws InterruptedException {
        // thread sync is a mechanism to share a resource between threads
        // in a safe and efficient manner
        // it is achieved by using synchronized keyword
        // a variable should be accessible by only one thread at one time else it produce wrong results

        Entry e = new Entry();
        Thread t1 = new Thread(()->{
            for(int i =0;i<10000;i++){
                e.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i = 0; i<10000; i++){
                e.increment();
            }
        });
        t1.start();
        t2.start();
        System.out.println("before "  + e.getCount());
        t1.join(); // join will do our work
        t2.join(); // join joins the thread with main thread
        System.out.println("after " + e.getCount());
        // lets remove synchronized keyword first then try run our keyword you do the same and run this file 
        // you will see a clear difference we never reached the final value  because one thread interupts another thread so 
        // 1/4 times (interruption is occuring )
        // lets add the synchronized keyword and see if we get final result 
        // hah, now we got the final result 20000, because threads are getting interrupted by each other
    }
}
