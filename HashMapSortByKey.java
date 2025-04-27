import java.util.*;
import java.util.stream.*;

public class HashMapSortByKey {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("C", 3);
        map.put("A", 1);
        map.put("B", 2);
        map.put("E", 5);
        map.put("D", 4);

        // Sort by keys and collect into a LinkedHashMap to preserve order
        Map<String, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, // Merge function to handle duplicates
                LinkedHashMap::new // Use LinkedHashMap to preserve insertion order
            ));

        // Print the sorted map
        System.out.println("Sorted Map: " + sortedMap);
    }
}
