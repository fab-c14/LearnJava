public class Conditionals{
    public static void main(String args[]){
        // IF ELSE CONDITIONS 
        int x = 18;
        if (x>18 && x<=20){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
        // if-else-else_if

        if(x>18){
            System.out.println("You are an adult." + x);
        }else if(x>60){
            System.out.println("You are Being Old " + x);
        }
        // we can add as many as else_if statements in between for mutliple conditions 
        else{
            System.out.println("Get Out Of Here");
        }
        // ternery

        x = 5;
        int y = 7;
        int result = (x>y)?x:y;
        System.out.println(result);


        // Switch Statement 
        int n = 7;
        switch(n){
            case 1:
                System.out.println("Monday.");
                break;
            case 2:
                System.out.println("Tuesday.");
                break;
            case 3:
                System.out.println("Wednesday.");
                break;
            case 4:
                System.out.println("Thursday.");
                break;
            case 5:
                System.out.println("Friday.");
                break;
            case 6:
                System.out.println("Saturday.");
                break;
            
            
            default:
                System.out.println("Sunday");
        }
    }
}