// abstract class A {
//     public abstract void show();

//     public abstract void config();
// }
interface A {
    // every variable in interface are by default final and static
    int age = 44;
    String area = "something";// final and static we can directly use interface variables

    void show();

    void config();
}

// instead of creating abstract class we can use interface, interface is not a
// class, everything in interface is public abstract

// class will impliment interface, in class we used extends keyword but we use
// implements here in case of implementing interfaces
class B implements A {

    public void config() {
        System.out.println("in show");

    }

    public void show() {
        System.out.println("in config");

    }

}

public class Interfaces_01 {
    public static void main(String[] args) {
        A obj; // we can create refrences but not object of interface,

        System.out.println(A.age + A.area);
        // A.area = "something"; //will give you an error
    }
}
