
/* NOTE : EVERYTIME YOU WANT TO RUN THE CODE UNCOMMENT THE CODE OR 
 COPY PASTE IT OUTSIDE THE COMMENT AND COMPILE AND RUN THE FILE */

//////////////////////////////// UNIT I /////////////////////////////////

// JAVA WAS DEVELOPED BY JAMES GOSLING IN 1995

/*******  JAVA FEATURES *********/
/*
    1. static typed
    2. platform independent
    3. object oriented(purely)
    4. robust(strong memory management)
    5. supports multithreading 
*/

/******** SETTING PATH  *******/
/* 
    EDIT SYSTEM ENVIRONMENTAL VAARIABLE .. one method
    OPEN CMD PROMPT and set PATH VARIABLE .. second method
    CLASSPATH - is a variable where we tell our jdk or jvm where to look for files(where our files are located).
    classpath is a parameter in JVM, we can either set it throught command line or env. variables 
*/

/******** COMPILATION PROCESS *********/
/*
    .java -> compiler -> bytecode (platform independent)
    ///compilation is done by javac(java -c=compiler ) ///
    bytecode -> jvm -> execution of bytecode -> output
    ///execution is done by java filename (note filename must be a .class file) ///
    // in the execution processs jvm first loads class file -> classloader then bytecode verifier verifies the code
    -> JIT compiler converts the code into equivalent machine code

*/

/******* SCOPE vs LIFETIME *******/
/* 
    SCOPE - is the area of code where a variable can be accessed. 
    LIFETIME -  is the length of time a variable is in valid state 

    / **** SCOPE is the subset of lifetime 
        SCOPE has two types global and local scope -- we already know this 
    / **** lifetime - time a variable holds memory and address **** /
*/

/*********  CONSTANTS *************/
/*
    we use final keyword to make a variable constant 
    final doube PI = 3.14
    PI = 3.15 // will give you an error 
    // classes with final keyword can not  be inherited 
    // methods with final keyword can not be overridden, but note can be overloaded
*/

/*******  LITERALS *******/
/*
    integer literals : numerical values -> decimal, octal, hexadecimal, and binary
    floating point : real numbers
    character : single characters
    string : sequence of characters
    boolean : these rep logical values true and false
*/

/*********  SWITCH CASE + IF ELSE +  LOOPS *********/
/* 
    we already know about these
    how ever there is one more loop enhanced for loop 
*/

/******** ARRAYS IN JAVA ********/
/*
    array stores collection of items. fixed in size
    int[] myArray = new int[10]
    
    now set individual elements one by one
    myArray[0] = 30;
    ////// or //////
    int myArray[] = {1,2,3,4}

    /// multidimensional arrays ///
    int myArray[][] = {
        {1,2,3},
        {2,3,4}
    }

    /// Passing arrays as an Arguments ///
    public static void printArray(int[] array){
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i])
        }
    }

    printArray(array)

*/

/***** CLASSES AND OBJECTS  *****/
/* 
    class Calculator { // class

    public int add(int n1, int n2) {
        // System.out.println("in add");
        return n1 + n2;
    }
}

public class first_oop {
    public static void main(String args[]) {
        int num1 = 4;
        int num2 = 7;
        int result = num1 + num2; ...
        System.out.println(result);
        // how to call the add function
        // creating object of class
        // Calculator calc; /// just created an refrence so it still does not work
        // you have to give space to object.
        Calculator calc = new Calculator(); // this is how we create objects
        result = calc.add(num1, num2);
        System.out.println(result);
    }
}
*/

/*****  METHODS AND METHOD OVERLOADING *****/
/* 
    
    class Calculator{
        public int add(int n1, int n2){
                return n1 + n2;
        }
        // overloading add function/method  (method overloading)
        public int add(int n1, int n2, int n3){
                return n1 + n2 + n3;
        }
        // overloading add function/method (method overloading )
        public double add(double n1, int n2){
                return n1 + n2;
        }
    }
    public class Method_Overloading {
        public static void main(String args[]){
            Calculator obj = new Calculator();
            int r1 = obj.add(3,4);
            System.out.println(r1);
            int r2 = obj.add(3,4,5);
            System.out.println(r2);
            
            double r3 = obj.add(3.4,9);
            System.out.println(r3);
        
        }
    }

*/

/******* CONSTRUCTORS AND DEFAULT CONSTRUCTORS  *******/
/* 
    class Human{
    String name;
    int age;
    // constructor looks like a method., constructors don't have return type, have same name as class

    public Human(){
        // default constructor - no parameters 
        System.out.println("in Constructor");
    }
    // constructor overloading
    public Human(int a, String s){
        // parametrized constructors
        name = s;
        age = a;
    }
    
}
class Constructors{
    public static void main(String args[]){
        Human h1 = new Human(20,"Faisal"); // overrided constructor 
        Human h2 = new Human(); // deafault constructor
        System.out.println(h1.age);
        System.out.println(h2.name);
        }
    }

*/

/****** STATIC KEYWORD *******/
/*
    class Mobile{
        String brand;
        int price;

        // String name; // i want name to have same name for all objects 
        // so lets change it to static 
        static String name = "Phone";

        // public void show(){
        //     System.out.println(brand + " " + price + " " + name);
        // }
        public static void show1(Mobile Obj){
            System.out.println("Static Method");
            // System.out.println(Obj.brand + " " + Obj.price + " " + Obj.name);
        }
    }

public class TheStaticKeyword {
    public static void main(String args[]){
        // what is the 'static'
        // Mobile obj1 = new Mobile();
        // obj1.brand = "apple";
        // obj1.price = 15000;
        // // obj1.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 15000;
        // // obj2.name = "SmartPhone"; // this will affect the obj1.name also
        // obj1.show();
        // obj2.show();

        // static variables should be called with classname not with objects 
        // static variables are shared by all objects of class, non-static methods can't use static variables - there is different area in jvm where we store our static variables.

        // STATIC METHODS. 
        // Mobile.show1();// static methods can be called with className
        // why we can't use static methods inside non-static methods/ 
        Mobile obj1=new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1444000;
        Mobile.show1(obj1);


        // STATIC BLOCKS 
        
    }
}





 ////////// STATIC USE CASE /////////
    class Examine {
        static int x = 0;
        public Examine(){
            x++;
        }
        public final void howManyObjsCreated(){
            System.out.println(" There are " + Examine.x + " Object of this class");
        }
    }
    class practice{
        

        public static void main(String args[]){
            Examine ex1 = new Examine();
            Examine ex2 = new Examine();

            ex1.howManyObjsCreated();
            ex2.howManyObjsCreated();
        }
    }

*/

/************* THIS KEYWORD *************/
/* 
    class practice{
        public void sampleMethod(practice obj){
            System.out.println(obj.getClass());
            System.out.println(this.getClass());
        }
        public static void main(String args[]){
            System.out.println("something");
            practice obj =  new practice();
            obj.sampleMethod(obj);
        }
    }

*/

/************ GARBAGE COLLECTION ****************/
/*
    is the automated process of deleting the code(free up memory) that's no longer needed or used
    performed by the jvm
    1. reassignment 
    2. points to null 
    3. anonymous object

    // we can manually invoke it by using this code
    System.gc() //

    /////// MANUALLY MANAGE GARBAGE COLLECTION ///////
    Object obj = new Object()
    obj = null
    System.gc() // invoke garbage collector
    .... peform other operations
*/

/************ FINALIZE METHOD ****************/
/*

    // peforms any neccessary operations such as closing any open resources 
    // it is called be garbage collector before an object is garbage collected
    // returns no value and takes not arguments
    // used to release resources
    // all objects in java has finalize method (point to remember)
    // but its access is protected, but can be called by subclasses
    // example : when closing a database connection we may need finalize method
    protected void finalize() throws Throwable{
        try{
            // release the resources
        }
        finally{
            super.finalize();
        }
    }
    // its not 100% that finalize method will be ccalled or not its upto garbage collector
    // remember this line for finalize keyword
    // ->returns no value -> nor takes arguments -> all objects have finalize method -> protected
*/

//////////////////////////////// UNIT II /////////////////////////////////

/************ INHERITANCE AND AGGREGATION *************/
/*
    inheritance - allows to create a based on new class (is a relationship)
    aggregation - class to be created that has a relationship with another class
    
    ////////// INHERITANCE EXAMPLE ///////////
    class Animal {
    public void makeSound(){
        System.out.println("woof woof");
        }
    }
    class Dog extends Animal {
        @Override
        public void makeSound(){
            System.out.println("bow bow bow ");
        }
    }

    public class practice{
        public static void main(String args[]){
            Dog dog = new Dog();
            dog.makeSound();
        }
    }
    //////// AGGREGATION EXAMPLE /////////
    class Car{
        private Engine engine;
        public Car(Engine engine){
            this.engine = engine;
        }

        public void start(){
            engine.start();
        }
    }
    class Engine{
        public int engine;

        public void start() {
            System.out.println("Engine Started");        
        }
    }
    class practice{
        public static void main(String[] args)

        {
            Engine engine = new Engine();
            Car car = new Car(engine);
            car.start();
        }
    }
*/

/********* TYPES OF INHERITANCE **********/

/*
    single - basic -- one class inherits from one parent class
    multilevel - subclass inherits from parent class whihc inherits from its parent class
    heirarchical inheritance - a parent class has multiple child classes
    hybrid - combination of two or more types of inheritance
    note : multiple inheritance is not allowed in java but we can use interfaces to implement multiple inheritance
*/

/********* METHOD OVERRIDING  **********/

/*
    Method Overriding - feature that allows a subclass to provide a 
    specific implementation of a method that is already

    /////////// EXAMPLE //////////
    class Animal{
        public void makeSound(){
            System.out.println("I am an Animal, tadaaaaaaaaaaaaaaa, \n Don't Laugh Humans are Social Animal");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound(){
            System.out.println("Wooof!!");
        }
    }

    class practice {
        public static void main(String[] args) {
            Dog d1 = new Dog();
            d1.makeSound();
        }
    }
*/

/********* ACCESS SPECIFIERS  **********/

/*
    simply we achieve encapsulation by access modifiers
    public : most visible and can be accesses from anywhere
    private : least visible and access with same class
    protected : can be accessed within same class, in subclass and in same package
    default : default access modifier,within the same package
*/

/********* COVARITANT RETURN TYPES **********/

/*
    allows the subclass to override the behaviour of an existing superclass method 
    and specify a return types that is some subclass of the original return type
    class Animal{
    public Animal makeSound(){
        return new Animal();
        }
    }

    class Dog extends Animal {
        @Override
        public Dog makeSound() { // we are returning an animal 
            return new Dog();
        }
    }

    class practice {
        public static void main(String[] args) {
            Dog d1 = new Dog();
            Animal a1 = new Animal(); 

        }
    }

    // note this is allowed for non primitve data types
*/

/********* SUPER KEYWORD **********/

/*

    class Animal {
        public void eat(){
            System.out.println("Animal Is Eating");
        }
    }

    class Dog extends Animal {
        @Override
        public void eat() {
            System.out.println("Dog is Eating");
        }

        public void classSuperEat() {
            super.eat();// to call parent class method
        }
    }

    class practice {
        public static void main(String[] args) {
            Animal d1 = new Dog();
            d1.eat();
            // d1.classSuperEat();
            Dog d2 = new Dog();
            d2.eat();
            d2.classSuperEat(); // by class animal class
            // Dog d2 = new Animal();
            // d2.classSuperEat();
        }
    }
*/

/*********  OBJECT CLASS  **********/

/*
    Object class - root of the class hierarchy
    super class of every class in java
    it defines bastic state and behaviour that all object must have
    such as ability to compare, getclassname,convert to a string wait on a condition...
    //// try this snippet out ///
    class practice extends Object {
    public static void main(String[] args) {
        practice p1 = new practice();
        System.out.println(
        p1.hashCode() + p1.getClass()); // one of methods provided by object class
    }
}
*/

/********* ABSTRACT CLASS  **********/

/*
    restricted class that can not be used to create objects
    to access it,it must be inherited from another class
    abstract method can only be used in abstract class and it does not have a body

    ////// EXAMPLE /////

    abstract class A {
        public abstract void show();

        public abstract void config();
        // an abstract class can have  non abstract methods
        public void configure() {
            System.out.println("this is non abstract method");
        }
    }


    class B extends A {

        public void show() {
            System.out.println("in B Show");
        }

        public void config() {
            System.out.println("in B Show");
        }
    }

    class practice {
        public static void main(String[] args) {
            // A obj1 = new A(); // not allowed - abstract class object can not be created
            A obj2 = new B();// yes this will be allowed 
            obj2.config();
            obj2.configure();

            B obj3 = new B();
            obj3.configure();

        }
    }


*/

/********* INTERFACES **********/

/*
    using interface we achieve polymorphism
    every variable in interface are by default final and static
    everything in interface is public abstract
    in case of interfaces we have to implement interface not extend

    interface A {
        int age = 44; // like this -> public static final abstract int age = 40; --> interfaces make our code simpler
        String area = "something";
        void show();

        void config();
        // interfaces can not have non abstract methods, like abstract classes so that is the difference between two.
        // void configure(){
        //     System.out.println("inside interface, non abstract method");
        // }
    }

    class B implements A { 

        public void config() {
            System.out.println("in config");

        }

        public void show() {
            System.out.println("in show");

        }

    }

    class practice {
        public static void main(String[] args) {
            A obj1 = new B();
            B obj2 = new B();
            obj1.show();
            obj2.show();
        

        }

    }

    ////////////// MUTLIPLE INHERITANCE USING INTERFACES ///////////////////////
    interface A {
        int age = 44;
        String area = "something";
        void show();
        void config();
    }

    interface X {
        void run();
    }

    // can interface extend another interface how do we do that
    interface Y extends X {

    }

    class B implements A, X {

        public void config() {
            System.out.println("in config");

        }

        public void show() {
            System.out.println("in show");

        }

        public void run() {
            System.out.println("x is running...");
        }
    }

    class practice {
        public static void main(String[] args) {
            B obj1 = new B();
            A obj2 = new B(); // not a is a interface // because of overriding we can mention types of A here
            System.out.println(obj1.getClass());
            System.out.println(obj2.getClass()); // both have B class
            obj1.show();
            obj2.show();
            // obj2.run(); // this is not possible because we have mentioned it as interface type(ob2)
            obj1.run();// however this will work because mentioned type is B 

        }
    } /// also refer to loose coupling -- classes are independent of each other///
*/

/********* PACKAGES AND STATIC IMPORTS + CLASSPATH **********/

/*
     package is a namespace
     //// packages program //// 

     /// simple import ////
    import testFolder.testPackage_1;
    class practice {
        public static void main(Strin                                                                                                                                                                                                                                                                                       g[] args) {
            testPackage_1 t1 = new testPackage_1();
            t1.show();

        }
    }
    

    /// static import ///

    import static java.lang.Math.PI;
    import static java.lang.Math.pow;
    import static java.lang.System.out;

    class practice {
        public static void main(String[] args) {
            System.out.println(PI);

            System.out.println(pow(2, 3));
            
            // now i can use println directly also beacuase of static import
            out.println(PI);
            out.println(pow(2, PI));

        } 
    }

     //i have a package or say folder namely testPackage inside i have a file testPackage_1.java, choose your own files just run this program and just look at the output

     import static members of class
     packages are used to organize classes and interfaces into logical groups. 
     // classpath tells jvm where to find the libraries of classes


*/

/********* WRAPPER AND NESTED CLASSES **********/

/*
    // so that we can use utilities of classes... or methods
    // in primitive types we can not use that
    // Integer num3 = num; // boxing - taking primitive value and storing in class
    // int num4 = num3.intValue(); // unboxing- taking object type a
    // System.out.println(num3 instanceof Integer); // instance of operator


    ///////////////// NESTED CLASSES ///////////////

*/

//////////////////////////////////// UNIT III ///////////////////////////////////////

/********* Strings: Introduction, Basic String Operations, String Builder & Buffer Classes.  **********/

/*
    ////////////////// STRINGS ////////////////////

    public class practice {
        public static void main(String[] args) {
            
            String s1 = new String("here is data");
            System.out.println(s1); 
            String s2 = new String("here is data");
            System.out.println(s2.equalsIgnoreCase(s1));
            System.out.println(s1.equalsIgnoreCase(s2));
            System.out.println(s1.indexOf('i'));
            System.out.println(s1.charAt(5));
            System.out.println(s1.substring(5, 10));
            // System.out.println(s1.replaceAll("is", "was"));// why is is not replaced
            // System.out.println(s1.replace("is", "was"));
            // System.out.println(s1);
            // System.out.println(s1.toLowerCase() +  s1.toUpperCase() +  s1.length());
        }
    }


    //////// string operations //////////////////
    // ne.insert(1,"eeeeeeree")
    // ne.charAt();
    // ne.endsWith();
    // ne.startsWith();
    // ne.equalsIgnoreCase() // ignore lower and uppercase check if strings are equal or not
    // ne.capacity();
    // ne.replace(); // replace charcter with another character - all the ooccurences
    // ne.ensureCapacity();
    // ne.length()
    // ne.setLength()
    // ne.equals()
    // ne.append() // some methods used with strings
    // ne.substring() // return substring with a starting index and ending index
    // ne.toLowerCase()
    // ne.toUpperCase()

    ......To crate mutalbe sequences we use STRING BUFFER AND BUILDER......


    ////////// STRING BUFFER //////////// .. is synchronized, only one thread accesses it at a time, but its slower than builder
    class practice {
        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer("Faisal");
            System.out.println(sb.capacity());// there are also some methods which we can not use with string class
            System.out.println(sb.length());
            sb.append(" Bhat");
            System.out.println(sb.length());
            String st = sb.toString();

        }
    }




    ///////////// STRING BUILDER ///////////// ... not synchronized, mutiple threads can access it at a time, but its faster than buffer
    class practice {
        public static void main(String[] args) {
            StringBuilder sbuilder = new StringBuilder("here is builder");
            sbuilder.append(" appended text");
            System.out.println(sbuilder);
        }
    }

*/

/******************* * Exception Handling: Mechanism – Exception Object, 
                     * Throwing an Exception, Exception Handler, 
                     * Throwable Class, Types of Exception - Checked vs Unchecked, 
                     * Built-in vs User- Defined, Catching an Exception - try - catch-finally,
                     *  Specifying an Exception - throws. Manually Throwing an Exception - throw 
*********************/

/*
    ////////////////////// EXCEPTION HANDLING /////////////////////


    ... Exception handling is a mechanism to deal with errors that occur during execution of program 
    ... Exception - an event that occurs during exec. of program that disrupt normal flow of instructions
    ////////////////// TYPES OF EXCEPTION HANDLING ///////////////////////

        /////////////// CHECKED  /////////////////

            checked exceptions are checked by compiler at compile time...
            check exceptions examples 
            ...IOEXCEPTION,FileNotFoundException,SQLException
            must be declared thrown or manually handle them we will later know about `throws`

       //////////// UNCHECKED EXCEPTIONS ////////////
       Exceptions That are not checked by compiler at compiler time. 
       they include runtime exceptions
       ..
       .NullPointerException,ArrayIndexOutBoundsException,ArithmeticException

       by handling exceptions we can prevent code from crashing


    ////////////////////////// HERE IS HOW WE HANDLE EXCEPTIONS /////////////////////////////



    //////////// TRY CATCH FINALLY /////////////////
       try{
        // code that may throw an exceptions
       }
       catch(NullPointerException e){
        // Handle the exception
       }
       finally{
        // this will always execute
       }




    /////////////// EXCEPTION OBJECT /////////////////
       ... its is a instance of an exceptions class that contains information about an error. 
       such as name,description, and state of program where error occured
       like in java we have throw keyword to hand the exception to runtime

       when an error occurs within a method. the method creates the exception object and passes it to runtime system.



    ////////////////// THROWING EXCEPTIONS //////////////////
       .. we can also throw our own exceptions, explicitly from a method or block using throw keyword
       throw can be used to throw any type of exception..

       try{
         throw new Exception("Exception Message")

       }
       catch(Exception e){
        System.out.println(e.getMessage())
       }



    ////////////////// EXCEPTION HANDLER //////////////////
       .. the "throws" keyword is used to declare that a method may throw an exception


     ////////////////// THROWABLE CLASS //////////////////
        .. its is the root of all exceptions and errors in java, 
        .. it provides methods that are common to all exceptions
        ..such as getMessage(),getCause(),printStackTrace()

        Throwable class has two subclasses that is Error and Exception
        Error - represents serious problems
        Exceptions - represents represents problems that a resonable app might try to recover
        Exceptins class has subclass called RunTimeExceptions,
        RunTimeExceptions - Represents errors that do not need to be declared in methods' throws clause

    
    //////////////////// CHECKED VS UNCHECKED EXCEPTIONS //////////////////
    throwbale -> Exceptiions -> checked exceptions vs unchecked exceptions
    throwable -> Error
    -checked exceptions are checked by compiler, 
    - method must handle them or specify the exceptions using throws keyword

    checked exceptions is divided into two -> full checked vs paritally check exceptions 


    class practice {
        public static void main(String[] args) {
                try{

                    //user defined exception
                    throw new NullPointerException("null point exception");
                
                }
                catch(NullPointerException e){
                    // Handle the exception
                    // e.printStackTrace();
                    System.out.println(e.getCause());
                    
                }
                finally{
                    // this will always execute
                    System.out.println("finally this code will run");
                }
        }
    }
    

    //////////////////// BUILT IN VS USER DEFINED EXCEPTIONS //////////////



*/

/********* BONUS CONTENT(TAKING INPUTS) **********/

/*
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(num);
    sc.close();
*/

//////////////////////////////// UNIT IV /////////////////////////////////

// Before starting let me show you hierarchy of files 
/*                                                           (CLASS)
                                                    -------- Object---------                                          
                                                //                             \\
-------------- InputStream -------------------                                 ---------------------- OutputStream --------------
    /                |             \             \                             |                 |               |                | 
FileInput     ByteArrayInput  FilterInputStream   ObjectInputStream   FileOuputStream    ByteArraryOutputStream  FilterOutputStream  ObjectOutputStream
                             /              \                                                                     /              \
            DataInputStream      BufferedInputStream                                                    DataOutputStream      BufferedOutputStream  
                                   
*/                                              
                                                            
// add all these imports before you start running the code -> UNIT IV -> ITS IMPORTANT ELSE CODE WILL NOT WORK 
// we can simply say 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/***************************** JAVA INPUT AND OUTPUT STREAM ***************************/

/*
    java io -> input and output used to processs the input and produce output
    java uses streams to make io operations fast
    java.io contains all packages classes for input and output operations
     //// STREAM /// 
     sequence of data. composed of bytes, stream of water that flows continuously
    // INBUILT STREAMS //
    System.out // standard output stream 
    System.in // standard input stream
    System.err // standard error stream 
    System.out.println("Simple Message")
    System.err.println("error message")

    System.in.read()

    // if you want to print on console what we do is we do system.out.println(),
    // println is a method of printStream
    // out is object of printStream, it is created inside system class, so we have
    // to do system.out.println()
    // System.out.println("Enter a Number : ");// how we take input
    // System.in.read(); // read method returns int and it throws an exception, so
    // we have to handle it

    


    import java.io.IOException;

    class practice {
        public static void main(String[] args) throws IOException {
        int num = System.in.read(); // it will give me ascii value of anything i  input so itwll be an integer
        // only one character is read at a time
        System.out.println(num);
        System.out.write(num); // writes the byte 
        System.out.close(); // remember to write the byte close the System.out # 90 -> 9 will be written only one byte is written
        
        }
    }



    // we have a special option of buffer reader
    // java.io.BufferReader, first import

    // we have to work with another class

    class practice {
    
        public static void main(String[] args) throws IOException {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(in);
            // int a = bf.read();// will do the same 
            String k = bf.readLine(); // will read the full line // readline returns string
        
        
            bf.close();
            System.out.println(k); // will print the asci value of character
            

        }
    }
    


    /// BUFFERED WRITER ///
    class practice {
        public static void main(String[] args) throws IOException {
            OutputStreamWriter ow = new OutputStreamWriter(System.out);
            BufferedWriter bw = new BufferedWriter(ow);
            byte b = 65;
            bw.write(b);
            bw.write("\ni can also write string with help of BufferedWriter");
            bw.close();
        }
        
    }
    
    /// WRITING TO A FILE WITH BUFFERED WRITER AND FILEWRITER ///
    class practice {
        public static void main(String[] args) throws IOException {
            // OutputStreamWriter ow = new OutputStreamWriter(System.out);
            // lets use the files nwo 
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            byte b = 65;
            bw.write(b);
            bw.write("\ni can also write string with help of BufferedWriter");
            bw.close();
            // output will not be writen to console instead of into file
        }
        
    }




    //// READING FROM FILES ////
    class practice {
        public static void main(String[] args) throws IOException {
            // OutputStreamWriter ow = new OutputStreamWriter(System.out);
            // lets use the files nwo 
            FileReader fw = new FileReader("output.txt");
            BufferedReader bw = new BufferedReader(fw);
            System.out.println(bw.readLine());; // read the first line 
            System.out.println(bw.readLine());// read the 2nd line 
            // output will not be writen to console instead of into file
        }
        
    }
    
    // THERE ARE SO MANY WAY YOU CAN READ AND WRITE FILES IN JAVA //

    class practice {
        public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // scanner has methods to read 
        String s = sc.next();
        System.out.println(num);
        System.out.println(s);
        sc.close();
        }
        
    }

*/



/*****************************  Reader & Writer Classes *****************************/

/*
    //// Reader ////
    - abstract class that defines an interface for reading character has several subclasses
    // BufferedReader
    // CharArrayReader
    // FileReader
    // InputStreamReader
    // StringReader
    //// Writer ////
    -abstract class that defines an interface for writing characters has several subclasses
    // BufferedWriter
    // FileWriter
    // OutputStreamReader 
    // PrintWriter
    // StringWriter

*/

/***************************** Buffered Input/Output Stream *****************************/

/*
    //// BufferedInputStream and BufferedOutputStream ////
    - are classes that use internal buffers to store data to be read or written,avoid unneccessarys system calls,transfer data, reducer process time and improves performance
    ////// EXAMPLE ///////

    class practice {
        public static void main(String[] args) throws IOException {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("output.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output1.txt"));
            // Read from ouput file and write it to output2.txt filee
            int b;
            while ((b = bis.read()) != -1) { // one character is read at a time
                bos.write(b);
            }
            bos.close();// remember if you not close the file then contents will  not be saved
        }
    }

    
*/



/***************************** File Input/Output Stream *****************************/

/*
        /////// JAVA FILES //////
        // Already done in pre view at example //
        // we can use any method to read and write to files //
        // le mee give you one example still though //
    
*/


/***************************** File Reader/Writer Classes *****************************/

/*
        //// FIle reader and write /// classes
          File file = new File("input.txt");
        // now lets read the file 
        ///// FILE READER //////
        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        String line2 = br.readLine();
        System.out.println(line);
        System.out.println(line2);
        br.close(); // close the buffered reader after reading 

        /////// FIle Writer ///////////
        File file = new File("output2.txt"); 
        FileWriter fw = new FileWriter(file);

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("this is line 1 \n line 2 \n line 3 \n and we can add more and more data");

        // until you dont close the file contents would not be saved
        // so lets save it first  // also contents are overridden 
        bw.close();
    
*/

/***************************** Data Input/Output Stream *****************************/

/*
        FileInputStream fs = new FileInputStream("output2.txt");
        FileOutputStream fos = new FileOutputStream("output3.txt");
        // data input and output stream same as we have done 
    
*/

/***************************** Threads: Introduction *****************************/

/*
     ///// Threads ////
     - a lightweight sub-process that can run concurrently with other threads 
     -- our program is a main thread(process), and we can divivided it into multiple threads(sub-processes)

*/

/***************************** Creating Threads in Java *****************************/

/*
    class A extends Thread {
        public void run() {
            for (int i = 1; i <= 100; i++) {
                    System.out.println("hi");
                }
            }
        }

    class B extends Thread { // by extending with thread its not a normal class. its a thread now
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println("hello");
            }
        }
    }

    public class practice {
        public static void main(String[] args) throws Exception {
            // Threads -> when you run an app, it will be running on os and below os there
            // will be a hardware, on os there will be multiple softwares running...
            // we will have multiple softwares, so they should work at a same time,
            // modern os support that,
            // multiple threads -> creating threads
            // most of times threads are created by frameworks, threads will not be created
            // by you most of times

            A obj1 = new A();
            B obj2 = new B();

            // obj1.show();
            // obj2.show();
            // we have to class start method

            // obj1.start(); // start calls run method so change show method to run method
            // obj2.start();
            System.out.println(obj1.getId());
            System.out.println(obj2.getId());
            // System.out.println(obj1.getPriority());
            // System.out.println(obj2.getPriority());
            // System.out.println(obj1.isAlive());
            // obj1.start();
            // obj2.start();
            // System.out.println(obj1.isAlive());
            // System.out.println(obj1.isInterrupted());
        


        }
    }

    
*/


/***************************** Java Thread Lifecycle *****************************/

/*
        ///// Thread State in java /////
        - threads has a state
        -- New -> when we create a thread the state is new 
     
        -- Runnable -> a thread that is ready to run i moved to the runnable state. the thread is waiting to be scheduled by the scheduler
        -- Blocked -> a thread that is waiting for a resource to become available is in blocked state
        -- Waiting -> a thread is wating for another thread to finish executing is in the waiting state
        -- Terminated -> a thread that has finished its execution. thread can not be restarted

        ///// THREAD LIFECYCLE ////
        new -> runnable -><- running-> dead
        notify()  \            / stop(0)
        notifyAll()\          / block()
                    |blocked |
                    |waiting |
                    |sleeping|
*/

/***************************** Multithreading in Java *****************************/

/*
         VISIT-> Threads_01.java,Threads_02.java, Threads_03.java, Threads_04.java,Threads_05.java
         hold ctrl and click one of text your want from above names
         // because threads are important so it's impossible to understand it here so visit the files to better understanding 
    
*/

/***************************** Synchronization . *****************************/

/*
    class Entry{
        private int count = 0;
        public synchronized void increment(){
            count++;
        }
        public synchronized int getCount(){
            return count;
        }
    }
    public class practice {
        public static void main(String[] args) throws InterruptedException {
            // thread sync is a mechanism to share a resource between threads
            // in a safe and efficient manner
            // it is achieved by using synchronized keyword
            // a variable should be accessible by only one thread at one time else it produce wrong results

            Entry e = new Entry();
            Thread t1 = new Thread(()->{
                for(int i =0;i<10000;i++){
                    e.increment();
                }
            });
            Thread t2 = new Thread(()->{
                for(int i = 0; i<10000; i++){
                    e.increment();
                }
            });
            t1.start();
            t2.start();
            System.out.println("before "  + e.getCount());
            t1.join(); // join will do our work
            t2.join(); // join joins the thread with main thread
            System.out.println("after " + e.getCount());
            // lets remove synchronized keyword first then try run our keyword you do the same and run this file 
            // you will see a clear difference we never reached the final value  because one thread interupts another thread so 
            // 1/4 times (interruption is occuring )
            // lets add the synchronized keyword and see if we get final result 
            // hah, now we got the final result 20000, because threads are getting interrupted by each other
        }
    }

*/

/***************************** and Inter-process communication (IPC) in Threads *****************************/

/*
    // one way we saw how to communicate between threads (process) - that is shared resource 
    // in broader view ->  one thread will write to variable and one thread will read the variable
    // we can use sockets , pipes, sharedmemory(variable),messagequeues
    // since we have already seen a program we can use that program also for this ipc-> because its in threads 
    // we are using synchronized keyword so that only one will access it at a time 
    // but let's get one example with pipes

    ///// EXAMPLE ////////

    import java.io.*;
    public class IPC {
        public static void main(String[] args) throws IOException{
            PipedInputStream in = new PipedInputStream();
            PipedOutputStream out = new PipedOutputStream(in); // pass in object to connect pipes

            Thread t1 = new Thread(()->{
                try {
                    out.write("Hello world".getBytes());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                try {
                    out.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
            Thread t2 = new Thread(()->{
                byte[] bytes = new byte[1024];
                int read;
                try {
                    read = in.read(bytes);
                    System.out.println(new String(bytes,0,read));
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            });
            t1.start();
            t2.start();
        }
    }

    
*/


/***************************** Applets: Java Applet Architecture *****************************/

/*
    /////// APPLETS ////////
    - applets is a java program that runs in java-enabled web browser. applets are embedded within HTML pages and are typically used to provide interactive features
    -- applet class is the base class for all applets
            provides various methods to control lifecyle of applets
            init(),start(),stop(), and destroy() 
    -- appletcontextinterface
            applet context interface provides methods that allow applets to interact with browser in which they are running

    -- appletstubinterface
            provides methods that allows applets to interact with the HTML page in which they are embedded
    // applets can be used to build web based apps .... etc
    
*/

/***************************** Working and Lifecycle of Applet *****************************/

/*
    applet lifecyclye is how an applet is created,started, stopeed and destroyed during its execution.
    four methods in applet lifecycle are
    init() // intializes any variables or methods
    start() // runs the applet
    stop() // stops the applet - end processing
    destory() // release memory and object 

    /// EXAMPLE OF  BASIC APPLET ///

    import java.applet.Applet;
    import java.awt.Graphics;

    public class practice extends Applet {
        public void init() {

        }

        public void start() {

        }
        
        public void paint(Graphics g) {
            g.drawString("Hello world", 50, 50);
        }

        public void stop() {

        }

        public void destroy() {
            
        }
    }
    //// Compile this code only you might get a warning or note ignore that after that you will have a class file ////
    /// now load an .html file into editor and use this line there ///
    // i my case i have already a file here that is index.html ///
    // here is code of line which you need there
    // note instead of practice.class you class file might have a different name 
    `<applet code='practice.class' width="300" height="200" ></applet>`
    // use internet explorer for applets  since applets are n't used any more so chrome,edge,opera does not support applets 
    // internet explorer is only browser which support applets , so its better to read something else 
*/

/***************************** Displaying Text and Animation in Applet *****************************/

/*
    //// This was about displaying text now lets move to animation which is our next topic in our syllabus
    import java.awt.*;
    import java.applet.*;
    public class AnimationExample extends Applet{
        Image picture
        public void init(){
            picture = getImage(getDocumentBase(),''bike_1.gif'')
        }
        public void paint(Graphics g){
            for(int i =0; i<500;i++){
                g.drawImage(picture,i,30,this);
            }
            try{Thread.sleep(100)}catch(Exception e){}
        }
    }
*/

/***************************** Passing Parameters in Applet *****************************/
/*
    // now how do we pass parameters in applets 
    // we use getParameter() function to do this job
    // pubic String getParameter(String parameterName) // if the paramtere is not set it will return null
    // lets see in practiclal here i have two files index.html and practice.java

    /////// INDEX.HTML //////
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        
    </head>
    <body>
       
        <applet code="practice.class" width="300" height="200" ></applet>
        <param name="message" value="Welcome to the boring applet class" >
    </body>
    </html>

    /////// Practice.java //////
    import java.applet.Applet;
    import java.awt.Graphics;

    public class practice extends Applets{
        public void paint(Graphics g){
            String message = getParameter("message");
            g.drawString(message,50,50);
        }
    }



    /// UFFF - APPLETS ARE OLD WHY ARE THEY IN OUR SYLLABUS , BUT STILL THOUGH ITS OKAY
    /// JAVA IS GOOD PROGRAMMING LANGUAGE BUT APPLETS AREN"T GOOD, DON'T READ APPLETS IN DEPTH JUST FOR EXAM PURPOSE
    ////// THAT IS CORE_JAVA SEE YOU SOMETIMES THAT IS THE END OF COURSE - FAB-C14[Faisal] ///////
    // say with me applets are boring boring boring boring they don't deserver to be here //
                                    hiiiiihiiiiihiiiiihhiiiiihiiiii  - bye 
*/

//////////////////////////////////////////////////// THE END ////////////////////////////////////////////