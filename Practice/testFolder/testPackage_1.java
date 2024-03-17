package testFolder;

public class testPackage_1 {
    public static void main(String[] args) {
      
        // System.out.println("This is Package " + obj1.getClass() + obj1.getClass().getPackageName()); // will give me the package name and its class name
    }

    public void show() {
        testPackage_1 obj1 = new testPackage_1();
        System.out.println("This is : " + obj1.getClass().getSimpleName() +  " package name is : "  + obj1.getClass().getPackageName());
    }
}
