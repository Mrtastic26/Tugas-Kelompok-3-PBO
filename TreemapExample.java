import java.util.Map;
import java.util.TreeMap;
 
public class TreemapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
 
        // Menambah elemen pada tree map
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);
        System.out.println(treeMap);
        // Mendapatkan nilai dari tree map
        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA);
 
        // Menghilangkan elements pada tree map
        treeMap.remove("B");
 
        // Iterasi elements pada tree map
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}