// class Calculator{
//     int a;
//     public int add(){
//         System.out.println("in add");
//         return 0;
//     }
// }
class Calculator {

    public int add(int n1, int n2) {
        // System.out.println("in add");
        return n1 + n2;
    }
}

public class first_oop {
    public static void main(String args[]) {
        int num1 = 4;
        int num2 = 7;
        int result = num1 + num2;
        System.out.println(result);
        // how to call the add function
        // creating object of class
        // Calculator calc; /// just created an refrence so it still does not work
        // you have to give space to object.
        Calculator calc = new Calculator(); // this is how we create objects
        result = calc.add(num1, num2);
        System.out.println(result);
    }
}
// every object has properties-behaviour/action will be done using methods
