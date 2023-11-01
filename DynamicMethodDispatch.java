class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B Show");
    }
}

class Computer {

}

class Laptop extends Computer {

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new B();
        obj.show(); // which show function will be called
        // by overriding b show will be called..

        // Computer obj1 = new Laptop();
        // we can mention object as parent type but object is of child type...
        obj = new B();
        // same object behaving differently - hence run time polymorphism, all this is
        // called dynamicmethoddispatch
    }
}