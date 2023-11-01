// System.out.print("Hello World");

// we dont write our code like this in java 
// how we write is in next video

// jvm -> in your machine (os ) - jvm runs java applications 

// jvm will work jvm works on which environment 

// your os is working on hardware 

// we have jvm on top and in middle we have os and at bottom we have hardware

// we will not run code which will directly work on hardwared

// we will run it at jvm 

// java is platform independent - you can run it on any machine 

// but that machine need to have a jvm 

// but jvm itself is platform is dependent 

// jvm need to be build for os

// jvm says i will run your code but you have to submit me byte code, but not source code, jvm only understands byte code

// but jvm only understands - byte code,

// but now we have to convert , source code to byte code

// to convert we need a compiler (javac)

// now jvm needs which file you want to run 

// the execution will start from first file , and it will start from main

// main has signature like this 
// public static void main(string a[]){

// }
// now lets try upper example which we tried previously
class Hi {

    public static void mains(String args[]) {
        // but now we need a class, because java is purely object oriented programming

        System.out.println("hello world!");

    }
}

// now this code will create a .class file , which is our byte code file.

// cooking -> extra things -> biryani -> extra things -> extra stuff -> when
// running java code you also need extra stuff(libraries)

// you need one more environment
// when you run something in java

// jre - java runtime environment
// inside jre we have jvm -> java virtual machine

// so we will jave {JDK->JRE->JVM}

// java is write once and run anwhere (wora)