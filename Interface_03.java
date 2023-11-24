// abstract class Computer {
//     // developer is dependent on computer, not on laptop, lets make it flexible
//     // public abstract void code() {// now finally we can add abstraction
//     // System.out.println();
//     // }
//     public abstract void code();
// }

// we can shrink this to interface
interface Computer {
    void code();
} //

class Laptop implements Computer { // lets make it extend computer
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code faster,compile faster,run faster");
    }
}

class Developer {
    // gimme laptop object then i will work
    // public void devApp(Laptop lap) { // tight coupling
    // // System.out.println("Coding...");
    // lap.code();
    // }
    public void devApp(Computer cap) { // tight coupling
        // System.out.println("Coding...");
        cap.code();
    }
}

public class Interface_03 {
    public static void main(String[] args) {
        // Laptop lap = new Laptop();

        // Developer faisal = new Developer();
        // faisal.devApp(lap); // i can not work without laptop

        // // lets say we have 100 of developers we have to provide 100 laptops, that
        // means
        // // evertime i am creating developer object we have to create a laptop object.
        // Desktop desk = new Desktop();
        // Developer x = new Developer();
        // // x.devApp(desk); // we are not accepting desktop objects
        Computer lap = new Laptop();
        Computer Desk = new Desktop();
        Developer d = new Developer();

        d.devApp(lap);
        d.devApp(Desk);

    }
}
