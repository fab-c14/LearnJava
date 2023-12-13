// @FunctionalInterface
// interface A {
//     void show();
// }
// @FunctionalInterface
// interface A {
//     void show(int a);
// }
@FunctionalInterface
interface A {
    int add(int a, int b);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        // syntatical sugar - reducing the code
        // A obj = () -> {
        // System.out.println("in show");
        // };
        // obj.show();

        // A obj = (int i) -> {
        // System.out.println("in show " + i);
        // };
        // obj.show(89);
        // A obj = i -> {
        // System.out.println("in show" + i);
        // };
        // obj.show(89);

        // lambda exp with return
        A obj = (int i, int j) -> i + j;
        int result = obj.add(5, 9);
        System.out.println(result);
        // lambda exp only works with functional interfaces

        // TYPES OF INTERFACES -
        // Normal - normal interface, two are more methods
        // Functional - (sam) sigle abstract method,interface with only one method
        // Marker - a blank inteface is caled marker, if you want totell compiler
        // something , java - serization - you
        // can take the object and store it into your hard drive
        // example when playing a game - after restart you will load current stats,now
        // game is no more ....
        // deserilization this is called
        // serilizables ...
        // blank interfaces are called marker interfaces
    }
}
