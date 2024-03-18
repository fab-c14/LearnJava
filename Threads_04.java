public class Threads_04 {
    public static void main(String[] args) {
        // what are different states of threads, everytime we create a thread it has a
        // new state
        // after than we have, run state, wait, running and dead

        // when you say .start() it goes to runnable state
        // new -> runnable ->> running -> dead
        // ------\> waiting -> running -> dead

        // to move from waiting to runnable state we have to use notify
        
    }
}