class TypeConversionAndCasting{
    public static void main(String args[]){
    //     //
    //     byte b = 127;
    //     int c = 256;
    //     c = b; // this is valid - implicit conversion or simply conversion 
    //     // b = c; // not valid 
    //     //what we can do is convert the type 
        

    //     b = (byte) c; // this is called casting , explicit conversion is called casting,we have some conversion which are implicit, that are called conversion.// now this will work 
    //     // System.out.println(b);
    //     float f = 5.6f;
    //     int x = (int) f;// after . everything will be cut off
    //     // System.out.println(x);

        // byte b = 127;
        // int a = b;
        // int a = 257;
        // // System.out.println(a);

        // byte k = (byte) a; // modulus will be performed, it will be divided by byte range that is 256
        // System.out.println(k);


        // float f = 5.6f;
        // int t = (int) f; // casting is important topic ,

        // conversion is implicit conversion,

        // there is one more concept - type promotion

        byte a = 10;
        byte b = 30;
        int result = a*b;// byte * byte is byte, now here automatically type will be promoted, 
        System.out.println(result);
    

    }
}