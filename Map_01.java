import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Map_01 {
    public static void main(String[] args) {
        // it is not a part of collection
        // but it does not extend collection interface,
        // but it is kind a
        // 45,67,89,23 --> we need to work with indexes, but sometimes its better to
        // have a different kind of index
        // key-value pairs <- map,
        // map is a collection of key-value pairs
        // Map<String, Integer> students = new HashMap<String, Integer>();
        Map<String, Integer> students = new Hashtable<>();
        students.put("Faisal", 56);
        students.put("Alice", 88);
        students.put("Bob", 83);
        students.put("Janeman", 92);
        students.put("Faisal", 45);
        // map does not follow a sequence
        // System.out.println(students);
        // System.out.println(students.get("Faisal"));

        // print all values at once
        // System.out.println(students.keySet());
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
        // hashtable and hashmap are quite a similar
    }
}
