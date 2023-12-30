public class ThrowKeyword {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try {
            j = 8 / i;
            if (j == 0) {
                // how do you calll catch block // we will use a keyword throw
                throw new ArithmeticException("here i passed the message now "); // we are trying to throw the error
            }

        } catch (ArithmeticException e) {
            // lets handle the exception...
            System.out.println("that is defautl output" + e.getMessage());
            j = 18 / 1;
            // we can simply retry

            // System.out.println("arithmetic exception");
        }
        System.out.println(j);
        System.out.println("done");
    }
}
