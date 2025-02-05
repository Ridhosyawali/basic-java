package day1.DataCollections.Set;

import java.util.HashSet;

/* Hashset implementasi dari interface set untuk menyimpan data data yang unik(tidak boleh duplikat)
* dalam bentuk himpunan atau set */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> himpunanNama = new HashSet<>();

        himpunanNama.add("ridho");
        himpunanNama.add("fakri");
        himpunanNama.add("ridho");

        System.out.println("Set Nama : " + himpunanNama)
        ;
    }
}
