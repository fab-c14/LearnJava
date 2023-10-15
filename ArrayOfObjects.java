class Student{
    int rollno; // instance variables 
    String name;
    int marks;
    void abc(){
        // 
    }
}
public class ArrayOfObjects {
    public static void main(String args[]){
        int nums[] = new int[6];
        int len_of_arr = nums.length; // finding length of array.
        System.out.println(len_of_arr);

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Faisal";
        s1.marks= 99;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Sai Kiran";
        s2.marks = 5009;

        //creating array of objects
        Student students[] = new Student[2]; // creating refrence to hold student objects.
        students[0] = s1;
        students[1] = s2;

        
      
        // System.out.println(s1.name);
        for (int i=0; i<students.length;i++){
            System.out.println(students[i].rollno + ":"+students[i].name + ":" + students[i].marks);
        }

        // Enhanced For Loops. or for each loop
        for(Student e: students){
            System.out.println(e.rollno + ":"+e.name + ":" +e.marks);
        }
    }
}
