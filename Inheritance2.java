// class Calc {
//     public int add(int n1, int n2) {
//         return n1 + n2;
//     }

//     public int sub(int n1, int n2) {
//         return n1 - n2;
//     }
// }

// inheriting a class
class AdvCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 * n2;
    }
}

public class Inheritance2 {
    public static void main(String args[]) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        System.out.println(r1, r2);

        // single level inheritance, multilevel inheritance
        // multiple inheritance in java
    }
}
