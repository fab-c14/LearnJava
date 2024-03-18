import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Student {
class Student implements Comparator<Student> {
    int age;
    String name;

    public Student(int age, String string) {
        this.age = age;
        this.name = string;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // public int compare(Object o1, Object o2) {

    // }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }

    }

    @Override
    public int compare(Student o1, Student o2) {
        return -1;
    }

}

public class Comparators {
    public static void main(String[] args) {
        // Comparator<Integer> com = new Comparator<Integer>() {
        // Comparator<Student> com = new Comparator<Student>() {
        // public int compare(Student i, Student j) {
        // // if (i % 10 > j % 10) {
        // // return i;
        // // } else {
        // // return -1;
        // // }
        // if (i.age > j.age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };
        // List<Integer> nums = new ArrayList<Integer>();
        List<Student> nums = new ArrayList<Student>();
        nums.add(new Student(20, "Faisal"));
        nums.add(new Student(22, "Somone"));
        nums.add(new Student(21, "Alice"));
        nums.add(new Student(34, "Ben"));
        // nums.add(87);
        // nums.add(2);
        // nums.add(1);
        Collections.sort(nums);// by com we specify our own method of sorting
        for (Student s : nums) {
            System.out.println(s);
        }
        // System.out.println(nums);
    }
}
