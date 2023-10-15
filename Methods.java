// package Object_Oriented_Programming;
// car - we have modules engine,brake,accelator,wheels..etc
class Computer{
    public void playMusic(){ // method 
        System.out.println("Music Played!");
    }
    public String getMeAPen(int cost){ /* provide money then i will give you a pen */
        if (cost>=10){

            return "Pen"; // returning a string
        }
        else{
            return "Only Pens With Greater Than 10 Rupees Are Available, you get Nothing";
        }
    }
}
public class Methods {
    public static void main(String args[]){
        Computer obj = new Computer(); // created an object
        obj.playMusic();
        // obj.getClass(); // save in variable 
        String x = obj.getMeAPen(20);
        System.out.println(x);
        String y = obj.getMeAPen(5);
        System.out.println(y);
    }
}
