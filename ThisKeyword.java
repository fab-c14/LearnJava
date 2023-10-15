
class Human{
    // int age; // bu default its public 
    // String name;
    // lets make it private
    private int age = 20;
    private String name = "faisal";


    // Encapsulation - only methods on this class should access this class variables 
    public void setAge(int age /*Human obj */ ){
        // Human obj1 = new Human(); // still the same result, created a new object, we don't want to create a new object,

        // obj1.age = age;
        // age = age;
        // obj.age = age;

        // now we use this keyword,
        this.age = age; // current object


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


public class ThisKeyword {
    public static void main(String args[]){
        Human obj = new Human();
        obj.setName("Faisal");
        // obj.setAge(99,obj);
        obj.setAge(12);
        int age = obj.getAge();
        String name = obj.getName();

        System.out.println("obj name is " + name + " and age is " + age);

    }
}

