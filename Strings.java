// stores name , faisal ' array of character '
public class Strings {
   public static void main(String args[]){
    // in characters we use single quotes, and strings user double quotes
    // String name = "Faisal"; // String is not a primitive data type 
    // String name = new String(); at lower level this is happening// here we got and object 'name' and object will get some memory from heap, 
    // String ne = new String();
    // System.out.println(ne);

    // but how to we pass data
    // String ne = new String("here is data");
    // System.out.println(ne);
    // System.out.println(ne.charAt(1));

    // // concat two strings 

    // System.out.println(ne.concat("hello" + "some more data"));


    // // direct method to create a string 
    // String name = "faisal";


    // mutable and immutable strings (types)
    String name = "faisal";
    name = name + " bhat"; // thiss will not work, here we are changing the address and creating new object,
    System.out.print(name);

    String s1 = "Faisal"; //create a string and store it in string constant pool
    String s2 = "Faisal"; // two refrences but in total we got only one object 
    System.out.println(s1==s2); // if true the same s1 and s2 have same memory, we already have "faisal" in string constant pool, so s1 adn s2 have same memory.
    // that is how java saves memory

    // in java string has some  heap memory called string constant pool, every string which is string is constant, we can not change it 

    // by default strings in java are immutable 
    // but what if we want to use mutable strings, we can use String Buffer and String Builder (which we will discuss later)
   StringBuffer sb = new StringBuffer("Faisal");
   // System.out.println(sb.capacity());
   System.out.println(sb.length());
   sb.append(" Bhat");
   System.out.println(sb.length());
   // String st = sb.toString(); // convert stringbuffer to string data type
   // try some different methods.
   sb.insert(0,"java");
   sb.setLength(30); // setting length, trim other 
   sb.ensureCapacity(100);// minimum capacity will be 100

   // stringBuffer is thread safe
   // stringbuilder - is not thread safe. we will talk it about later.

   } 
}
