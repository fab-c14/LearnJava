public class Exceptions_02 {
    public static void main(String[] args) {
        // try with multiple catches
        int i = 0;
        int j = 0;
        String str = null;
        int nums[] = new int[5];
        try {
            j = 8 / i;// arithmetic Exception
            System.out.println(nums[1]);
            System.out.println(nums[5]); // array index out of bound exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index out of bound exception");
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception");
        } catch (Exception e) {
            System.out.println("can not divide by zero");// handles all exceptions
            // make sure parent exception is at
        }
        System.out.println("done");
    }

    // Throwable <- Exception <- RuntimeException

    // exception hierarchy <-

    // Object class <- Throwable(able-ending names are mostly interfaces) <-
    // Exception <- RuntimeException <-
    // arithmetic,arrayoutofindex,nullpoint(unchecked exceptions ) + SqlExceptions ,
    // IoExceptions (checked Exceptions )
    // Throwable <- Error(io error, virtual machine error, thread death, out of
    // memory) + Exceptions (exceptions can be handled)

}
