
abstract class Car {
    // abstract class method should only be defined inside abstract class
    public abstract void drive();

    // we can also create as many as abstract classes as we want
    public void playMusic() {
        System.out.println("Play Music");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println(".teee teeee, teee, hooo driving...");
    }
    // what will happen if we don't impliment abstract methods, in that case it will
    // give you an error, but to solve you have to make it abstract class also, for
    // which you can not create objects

}

public class AbstractKeyword {
    public static void main(String[] args) {
        // abstract class object can not be created
        // but refrence can be cerated
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();

    }
}