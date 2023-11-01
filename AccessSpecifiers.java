class A {
    int a;
}

// we can not have two public classes in same file
public class AccessSpecifiers {
    public static void main(String[] args) {
        A obj = new A();
        // A.a;//can i access a , no
        // public specifiers - means it can be accesses anywhere, private variable can
        // be used in same class, it can not be used outside of class
        // default access specifier is there in if you don't mention any access
        // specifier, default specifier- mean it can be accesses within package
        // protected specifier - means that it can be accessed within inherited class,
        // but not outside class
    }
}
