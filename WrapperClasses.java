public class WrapperClasses {
    public static void main(String[] args) {
        // if you want to store 5 you will be using int, if 'a' then character... every
        // class in java is inheriting object class... but we have primitive values, but
        // we have certain features like collections, which is pure object oriented
        // int -> Integer , for primitive type we have a type for it
        // char -> Character
        int num = 7;
        // Integer num1 = new Integer(89); // deprecated syntax, we have better
        // alternative for it, num1 is a refrence
        // Integer num2 = 9; //
        // // System.out.println(num1);
        // System.out.println(num2);

        // Integer num3 = num; // boxing - taking primitive value and storing in class
        // object, it is called
        // // boxing , boxing is happening automatically
        // int num4 = num3.intValue(); // unboxing- taking object type a
        // System.out.println(num4);
        // int num5 = num3;// auto-unboxing

        String str = "12";
        int num6 = Integer.parseInt(str); // converts string to integer
        System.out.println(num6);
    }
}
