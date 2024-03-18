class Mobile{
    String brand;
    int price;
    static String name;
    // intializing with constructor
    Mobile(){
        brand="";
        name="Phone";
        System.out.println("In Constructor ");
    }
    // static block intialize variables - static blocks are called first 
    static {
        name = "Phone";
        System.out.println("In Static Block");
    }

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}

public class StaticBlocks {
    public static void main(String args[]) throws ClassNotFoundException{
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
       

        // everytime - class loads and object are instantiated
        // jvm has class loader, only once, static method will be called first, and then objects will be created, so after that constructor will be created 

        //  Class.forName("Mobile");// it loads class name is given as parameter // this given an exception for now , so we handled that at

    }
}
