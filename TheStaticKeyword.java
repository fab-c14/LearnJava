class Mobile{
    String brand;
    int price;

    // String name; // i want name to have same name for all objects 
    // so lets change it to static 
    static String name = "Phone";

    // public void show(){
    //     System.out.println(brand + " " + price + " " + name);
    // }
    public static void show1(Mobile Obj){
        System.out.println("Static Method");
        // System.out.println(Obj.brand + " " + Obj.price + " " + Obj.name);
    }


    
}

public class TheStaticKeyword {
    public static void main(String args[]){
        // what is the 'static'
        // Mobile obj1 = new Mobile();
        // obj1.brand = "apple";
        // obj1.price = 15000;
        // // obj1.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 15000;
        // // obj2.name = "SmartPhone"; // this will affect the obj1.name also
        // obj1.show();
        // obj2.show();

        // static variables should be called with classname not with objects 
        // static variables are shared by all objects of class, non-static methods can't use static variables - there is different area in jvm where we store our static variables.

        // STATIC METHODS. 
        // Mobile.show1();// static methods can be called with className
        // why we can't use static methods inside non-static methods/ 
        Mobile obj1=new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1444000;
        Mobile.show1(obj1);


        // STATIC BLOCKS 
        
    }
}
