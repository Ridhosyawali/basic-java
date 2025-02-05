package day1.DataCollections.List;

import java.util.ArrayList;
import java.util.LinkedList;


/* LinkedList : implementasi dari interface list yang mempunyai fungsi yang sama seperti arraylist */
public class LinkedListExample {
    public static void main(String[] args) {
        //linked List
        LinkedList<String> daftarNama = new LinkedList<>();

        daftarNama.add("Dini");
        daftarNama.add("Dina");
        daftarNama.add("Dino");
        daftarNama.addFirst("Danu");
        daftarNama.add("prasetyo");

        //cara nambahin elemen di indeks tertentu
        daftarNama.add(3, "Dinda");

        //Cara akses elemn di indeks tertentu
        System.out.println("data : " + daftarNama.get(0));
        System.out.println("data : " + daftarNama.getFirst());
        System.out.println("data : " + daftarNama.getLast());

        //mengubah elemen
        daftarNama.set(3,"Doni");

        //menghapus elemen
        daftarNama.remove(2);

        //menghitung jumlah elemen
        System.out.println("Jumlah data : " + daftarNama.size());

        //mengecek apakah ada arraylist kosong
        System.out.println("Apakah array list kosong? " + daftarNama.isEmpty());

        //mengecek apakah elemen tertentu ada didalam arrayList
        System.out.println("Nama 'Dina' ada didalam daftar : " + daftarNama.contains("Dina"));

        //mengambil indeks elemen tertentu
        System.out.println("index 'Dini' " + daftarNama.indexOf("Dina"));

        //menampilkan semua elemen dalam arraylist
        System.out.println("Daftar Nama : " + daftarNama);

        //menampilkan semua data pakai looping
        for (String nama : daftarNama){
            System.out.println(nama);
        }

    }
}
