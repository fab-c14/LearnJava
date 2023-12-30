// class A {
//     public void show() {
//         try {

//             Class.forName("Demo");
//         } catch (ClassNotFoundException e) {
//             System.out.println("not able to find the class");
//         }
//     }
// }

class A {

    public void show() throws ClassNotFoundException {
        Class.forName("Demo");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
        // lets say if there is critical statement in a function , we will use try catch
        // to handle that
        // lets say there is another funcction and there is also a statement which is
        // critical so we use try catch
        // lets say we have another and do....
        // we are repeating things,in each of method we
        // lets say we have another method where we are calling prev method whihc both
        // throw a exception, we will use try catch again...
        // we can write a throws keyword , lets see with example// we call it ducking
        // the exception

        // main -> b() -> c() --> everyone here throws exception

        A obj = new A();
        obj.show(); // jvm will stop the execution so using throws keyword with main is not
                    // recommended
                    // printStackTrace() - method show all methods which method is called which
                    // method, its helpful to debug application

    }
}
