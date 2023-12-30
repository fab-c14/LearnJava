class myException extends Exception {
    public myException(String str) {
        super(str);// passing the message parameter to super exception classs
        // System.out.println(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        // throwing my own exception can we say throw myException
        int i = 0;
        int j = 0;

        try {
            // j = 8 / i;
            if (j == 0) {
                // how do you calll catch block // we will use a keyword throw
                throw new myException("here i passed my message now "); // we are trying to throw the error
            }

        } catch (myException e) { // here i catched my own exception
            System.out.println(e.getMessage());
            // j = 18 / 1;

        }
        System.out.println(j);
        System.out.println("done");
    }
}
