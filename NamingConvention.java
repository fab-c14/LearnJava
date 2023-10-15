
class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in A show");
    }
}
public class NamingConvention {
    // java uses Camle casing, first word is Capital 
    // for vars and methods - small letters will be used
    // constants - all capital, PIE, BRAND
    public static void main(String args[]){
        // python follow snake casing that is they use underscore, my_method()
        // but in java we do camel case like this myMethod()


        // ANONYMOUS OBJECTS - 

        // A obj = new A(); // obj is a refrence variables , because it is reffering to a object
        // obj.show();

        // int marks; // creating refrence
        // marks = 99; // assigning value 


        // here is object creation

        // new A(); // creates an object, but how do we use it , it is called anonymous object, they don't have a name.
        new A().show(); // here is how we call it 
        new A().show();

    }
}
