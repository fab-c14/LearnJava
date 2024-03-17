package testFolder;

class Transcript {
    public void show() {
        System.out.println(" this is " + this.getClass().getSimpleName() + " and is located in package "
                + this.getClass().getPackageName());
    }
}

public class Transport {

    public static void show() {
        Transport obj1 = new Transport();
        System.out.println("this is static methods " + obj1.getClass().getName() + "and is located in package : "
                + obj1.getClass().getPackageName());
    }
}


// class TestStaticImport {
//     public static void main(String[] args) {

//     }

// }

