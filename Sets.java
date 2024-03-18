
// import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.Collection;

public class Sets {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();// set supports unique values
        // Set<Integer> nums = new TreeSet<Integer>(); // supports ordering
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(9);
        nums.add(2);
        nums.add(2);// this value will be removed/merged/ or not showin beccause sets support unique
                    // values
                    // sets does not support index values
        // for (Object e : nums) {
        // System.out.println(e);
        // }

        // on top of collection we have iterator
        // here is example
        java.util.Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}
