enum Status {
    Running, Failed, Pending, Success; // advantage - return status, instead return string we can directy return this
}

enum Laptop {
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800), Something;

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    private Laptop() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enums {
    public static void main(String[] args) {
        // named constants - enumerations
        int i = 5;
        // basically enum is class and inside it we have object see like this
        // Status s = Status.Running;
        // System.out.println(s);
        // // Status s = Status.noIdea; // error
        // // System.out.println(s);
        // System.out.println(s.ordinal());

        // // get all the status
        // Status s1[] = Status.values();
        // for (Status e : s1) {
        // System.out.println(e + " " + e.ordinal());
        // }

        // can we compare enums

        Status s = Status.Pending;

        if (s == Status.Running) {

            System.out.println("All Good");
        } else if (s == Status.Failed) {
            System.out.println("Try again");
        } else if (s == Status.Pending) {
            System.out.println("please wait");
        } else {
            System.out.println("Done");
        }

        // enums with switch
        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        // enum class - enum is a class - does that mean we can extend enum class -
        // answer is not
        // we have used enum class also methods of enum class, but where did we get
        // these methods from
        // lets play with enum class

        System.out.println(s.getClass().getSuperclass()); // printing the super class

        //

        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}