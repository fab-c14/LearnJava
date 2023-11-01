final class A {
    final public void show() {
        System.out.println("In A Show");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        // final keyword can be used with variable,class,method
        // int num = 8;
        // constants - we can't change the value, in java we use final keyword
        // final int num = 8;
        // num = 9; // here it will give you an error
        A obj = new A();
        obj.show(); // works fine, but if some one overrides this function, or class can not be
                    // inherited if its final
    }
}
