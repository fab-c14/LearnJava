
class Calculator{
   public int add(int n1, int n2){
        return n1 + n2;
   }
   // overloading add function/method  (method overloading)
   public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
   }
   // overloading add function/method (method overloading )
   public double add(double n1, int n2){
        return n1 + n2;
   }
}
public class Method_Overloading {
    public static void main(String args[]){
        Calculator obj = new Calculator();
        int r1 = obj.add(3,4);
        System.out.println(r1);
        int r2 = obj.add(3,4,5);
        System.out.println(r2);
        
        double r3 = obj.add(3.4,9);
        System.out.println(r3);
    
    }
}
