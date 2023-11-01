
class A {
    public void show1() {
        System.out.println("In a Show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In b Show");
    }
}

public class UpcastingDowncasting {
    public static void main(String args[]) {
        // double d = 4.5;
        // // int i = d; // 4.5 can not be stored, but 4 can be stored, java will not
        // allow
        // // it but we can say its okay by doing typecasting
        // int i = (int) d;
        // System.out.println(i);

        A obj = new A();
        obj.show1();

        A obj1 = (A) new B(); // upcasting - not compulsary, that is how dynamic method dispatch happens
                              // internally
        obj1.show1();
        // obj1.show2(); // but how do we call show2 method

        B obj2 = (B) obj1; // downcasting
        obj2.show2();
    }
}
