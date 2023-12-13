public class Exceptions_01 {
    public static void main(String[] args) {
        // Exceptions - First Understand Errors

        // 1 compile time error
        // easy to solve - syntatical errors

        // 2 runtime errors

        // runtime - execution stops , at runtime error,
        // can be solved be reopening (critical errors) - we can call them exceptions-
        // exceptions are runtime errors

        // 3 logical errors
        // logical error means there is no error but result is not as user want it to
        // be,output is wrong - they are called sometimes bugs

        // handling exceptions using try catch
        // statement - (1.normal) - (2.critical)
        // int i = 9; // normal statement
        // int j = 8 / i; // critical statements , if value of i is 9 then its fine if
        // its 0... then we
        // will get an error
        // exceptions stop execution of a program
        // its better to handle exceptions
        // here is how we handle exceptions
        int i = 0;
        int j;
        try {
            j = 8 / i;

        } catch (Exception e) { // exception is a class because try will throw an exception class object

            System.out.println("Something went wrong ");

        }
        System.out.println("Bye, this willl execute now");
    }
}
