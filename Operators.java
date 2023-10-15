class Operators{
    public static void main(String args[]){
        // ####### ARITHMETIC OPERATORS ########## //

        int num1 = 7;
        int num2 = 5;

        // now i can perform some operation
        // and we can save the result 

        int result = num1 + num2;

        System.out.println(result);


        // +,-,/,%,* - arithmetic operators.

        result = num1 % num2; // remainder operator

        System.out.println(result);
        // num1 = num1 + 2;// shortcut 
        // num1+=2; // add myself 2

        // num1++; // adds 1 to previous value of num1 are stores it in num1
        // // we can also decrement // post increment 
        // num1--; // subtracts 1 from previous value of num2 ...
        // // we can aslo do ++num1
        // ++num1; // pre-increment, 
        // --num1;// pre-decrement 

        // lets take example
    
        result = ++num1; // increment first then assign value 
        System.out.println(result); // 8

        result = num1++; // stores num1 first then increments num1
        System.out.println(result);// we should get 9 but here we got 8
        // System.out.println(num1);


        // ####### RELATIONAL OPERATORS ########## //
        // ==,!=,>=,<=,>,<
        boolean res = num1<num2;

        System.out.println(res);
        res = num1>num2;
        System.out.println(res);
        res = num1==num2;
        System.out.println(res);
        res = num1>=num2;
        System.out.println(res);
    
        // ####### LOGICAL OPERATORS ########## //
        // AND, OR, NOT, XOR[later]
        // &,(&&) - |.(||) - !

        boolean x = true;
        boolean y = false;

        res = x || y;
        System.out.println(res);
        res = x && y;
        System.out.println(res);
        res = !(x);
        System.out.println(res);

        res = x || y && num1 > num2;
        System.out.println(res);



    }
}