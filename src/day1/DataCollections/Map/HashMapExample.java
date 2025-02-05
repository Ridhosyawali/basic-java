package day1.DataCollections.Map;

import java.util.HashMap;

/* hashmap : implementasi dari interface Map, untuk menyimpan data objek dalam bentuk key-value
* Hashmap kaya represntasi data object kalo di Javavscript */
public class HashMapExample {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, String> daftarNama = new HashMap<>();

        // Nambahin data ke HashMap
        daftarNama.put("nama", "danu");
        daftarNama.put("umur", "17");
        daftarNama.put("job", "Trainer");

        // Cara akses data didalam hasmap
        System.out.println("Nama : "+ daftarNama.get("nama"));
        System.out.println("Umur : "+ daftarNama.get("umur"));
        System.out.println("Job : " + daftarNama.get("job"));

        //mengecek ukuran data
        System.out.println("Jumlah data : "+ daftarNama.size());

        //mengecek Hashmap kosong
        System.out.println("Hashmap kosong : "+ daftarNama.isEmpty());

        //nampilin semua key didalm hashmap
        for (String key : daftarNama.keySet()){
            System.out.println("Key : " + key);
        }

        //nampilin semua isi data dalam key hashmap
        for (String value : daftarNama.values()){
            System.out.println("data : "+ value);
        }

        //menampilkan semua key dan data di hashmap
        for (String key : daftarNama.keySet()){
            System.out.println(key + " : " + daftarNama.get(key));
        }

        // cara mengubah data dihashmap
        daftarNama.put("nama", "deni");

        // cara menghapus data berdasarkan key
        daftarNama.remove("umur");
    }
}
