import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Membuat objek LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Menambahkan elemen ke dalam LinkedHashMap
        linkedHashMap.put("Yaya", 22);
        linkedHashMap.put("Poal", 30);
        linkedHashMap.put("Zhafa", 20);
        System.out.println(linkedHashMap);

        // Mengakses nilai dengan kunci
        int Yayaage = linkedHashMap.get("Yaya");
        System.out.println("Umur yaya: " + Yayaage);

        // Menghapus elemen dari LinkedHashMap
        linkedHashMap.remove("Poal");

        // Menampilkan seluruh elemen dalam LinkedHashMap
        System.out.println("Isi LinkedHashMap setelah menghapus Poa: " + linkedHashMap);

        // Mengecek apakah LinkedHashMap mengandung kunci tertentu
        if (linkedHashMap.containsKey("Zhafa")) {
            System.out.println("LinkedHashMap mengandung kunci Zhafa");
        } else{ System.out.println( "Tidak ada kunci Zhafa dalam hashmap");
    }

        // Iterasi melalui setiap elemen dalam LinkedHashMap
        System.out.println("Iterasi LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Kunci: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }
    }
}
