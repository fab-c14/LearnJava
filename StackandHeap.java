// stack and heap
// inside jvm we have two parts
// stack and heap
// stack memory is - last in first out (LIFO)
// heap memory - 
// every method will have its own stack..
// stack will have 2 parts - value or variable, and variable name 
// remeber every method has it own stack 
// object will be created in heap.. local variables are part of stack
// but instance variables are part of heap here num is instance variable

// obj.add() , we are looking at stack stack will have object addresss which will be in heap... and methods will be in heap

// 
class Calculator
{
    int num;
    public int add(int n1, int n2){
        System.out.println(num);
        return n1+n2;

    }
}

public class StackandHeap
{  
    public static void main(String agrs[]){
        Calculator obj = new Calculator();
        // int r1 = obj.add(3,5);
        // System.out.println(r1);
        obj.num = 9;
            // System.out.println(obj.num);
        Calculator obj2 = new Calculator();
        System.out.println(obj.num);
        System.out.println(obj2.num); // value is not changed here, imagine you have two mobile phones of samsung if screen of one phone is broken,it won't effect other .
        
    }
}