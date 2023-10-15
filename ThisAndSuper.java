class A /* extends Object*/{ // even if you don't mention it is there.Object, 
    public A(){
        // super(); // even if we don't mention super is there
        System.out.println("in A");

    }
    public A(int a){
        super();// what is the super class of A, its not inheriting from someone, so what is super class for a? every class in java has exends Object class
        System.out.println("in A int");
    }
}
class B extends A{

    public B(){
        super();
        System.out.println("IN B");
    }
    public B(int a){
        // super(); super methods means call constructor of super class
        this();// executes construcotr of same class
        // super(1);// now we are calling parameterized constructor of parent class
        System.out.println("in B int ");
        // now i want to exec both constructors of b, thow can we do this
    }
}

public class ThisAndSuper{
    public static void main(String args[]){
        // B obj = new B(); // constructor of subclass as well as constructor of parent class
        B obj = new B(5);//why constructor of parent is class, by default every constructor have super();

    }
}