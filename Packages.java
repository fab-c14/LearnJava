import java.util.ArrayList;

import tools.Calc;

// whihc every class you want to use import it
// java has inbuild class/interface which we can import

class Packages {
    public static void main(String[] args) {
        // when ever you have a file we put them in a folder, whether it is a .mp3 .png
        // image or sound or vide file , we create a structure
        // similary your project will have files, imagine we have 1000 of files will put
        // them in only one folder
        // no we will use differnt folders and structure our project
        // here i haev shown how to create a package and how to use it
        // we can put our files in package
        // if i want to use add method inside Calc.java which is inside tools directory

        // Calc obj = new Calc();
        // int r1 = obj.add(2, 9);
        // System.out.println(r1);

        ArrayList obj1 = new ArrayList<>();

        // which ever class we use belongs to a package.
        // string is also a class, System is also a class, where is its package,
        // java.lang package , by default java.lang is imported mentioned
        // import java.lang.* everything is imported hence system is imported

    }
}