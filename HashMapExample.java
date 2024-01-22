import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Membuat objek HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Menambahkan elemen ke dalam HashMap
        hashMap.put("Rehan", 20);
        hashMap.put("Alex", 21);
        hashMap.put("Khoiri", 22);
        hashMap.put("Rehan", 63);
        hashMap.put("Yuma", 20);
        hashMap.put("Rehan", 45);
                
        System.out.println(hashMap);

        // Mengakses nilai dengan kunci
        int Rehanage = hashMap.get("Rehan");
        System.out.println("Umur Rehan: " + Rehanage);

        // Menghapus elemen dari HashMap
        hashMap.remove("Khoiri");
        
        // Menampilkan seluruh elemen dalam HashMap
        System.out.println("Isi HashMap setelah menghapus Alex: " + hashMap);

        // Mengecek apakah HashMap mengandung kunci tertentu
        if (hashMap.containsKey("Khoiri")) {
            System.out.println("HashMap mengandung kunci Khoiri");
        } else{ System.out.println( "Tidak ada kunci Khoiri dalam hashmap");
        }
       
        // Iterasi melalui setiap elemen dalam HashMap
        System.out.println("Iterasi HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Kunci: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }
    }
}
