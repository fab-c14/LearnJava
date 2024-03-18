
// import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import javax.xml.transform.Source;

public class ArrayList_01 {
    public static void main(String[] args) {
        // collections belongs to java.util
        // collection <- are implemented by some classes like
        // list, queue, set and other...
        // these have classes like list have arraylist, linkedlist
        // queues <- dequeue
        // set <- hashset,linkedhashset
        // map has multiple implementations
        // Collection<Integer> nums = new java.util.ArrayList<Integer>();// collection
        // is the interface/// llets do list
        // example
        // list supports index value

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(8);
        nums.add(6);// 6 5 8 2 are integers, it should be object, so where should we mention type we
                    // want to store by default its object
        nums.add(2);
        // nums.add("nums");// this will give you runtime error, if we don't mention
        // generic, if generic is mentioned then error will be at compiler time
        // we don't have indexing for collections
        System.out.println(nums.indexOf(5));
        for (Object n : nums) {
            System.out.println(n);
        }
        System.out.println(nums);
    }
}
