
class Human{
    // int age; // bu default its public 
    // String name;
    // lets make it private
    private int age = 20;
    private String name = "faisal";


    // Encapsulation - only methods on this class should access this class variables 
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }


    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation{
    public static void main(String args[]){
        
        Human obj = new Human();
        // obj.age = 11;
        // obj.name="Faisal";

        // System.out.println(obj.name);

        obj.setAge(20);
        obj.setName("Human");
        System.out.println(obj.getName() + " " + obj.getAge());

    }
}