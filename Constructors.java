class Human{
    String name;
    int age;
    // constructor looks like a method., constructors don't have return type, have same name as class

    public Human(){
        // default constructor - 
        System.out.println("in Constructor");
    }
    // constructor overloading
    public Human(int a, String s){
        // parametrized constructors
        name = s;
        age = a;
    }
    
}
class Constructors{
    // constructors are
    public static void main(String args[]){
        Human h1 = new Human(20,"Faisal"); // overrided constructor 
        Human h2 = new Human(); // deafault constructor
        System.out.println(h1.age);
        System.out.println(h2.name);
    }
}
