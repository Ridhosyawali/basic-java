package day1.DataCollections.List;

import java.util.ArrayList;

/* Array List : implementasi dari interface list yang fungsinya buat menyimpan data berbentuk array
* ArrayList bisanya dipakai untuk menyimpan data kompleks seperti objek
* kelebihan array list dibanding array biasa adalah kemudahan untuk manipulasi datanya */

public class ArrayListExample {
    public static void main(String[] args) {
        //array biasa
        int[] arrayBiasa = new int[5];
        arrayBiasa[0] = 10;
        arrayBiasa[1] = 20;

        //Array List
        ArrayList<String> daftarNama = new ArrayList<>();

        // cara menambahkan data/elemen ke dalam arraylist
        daftarNama.add("Dini");
        daftarNama.add("Dina");
        daftarNama.add("Dino");

        //cara nambahin elemen di indeks tertentu
        daftarNama.add(3, "Dinda");

        //Cara akses elemn di indeks tertentu
        System.out.println("data : " + daftarNama.get(0));

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

        //membuat arraylist dengan tipe daata yang berbeda
        ArrayList dataRandom = new ArrayList<>();
        dataRandom.add("dino");
        dataRandom.add(20);
        dataRandom.add(true);
        dataRandom.add(3.5);

        System.out.println("nampilkan data random : " + dataRandom);

        for (Object data : dataRandom){
            System.out.println(data);
        }
    }
}
