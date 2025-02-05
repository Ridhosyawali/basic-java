package day1.Basic;

/* JAVA : bahasa pemrograming OOP (Object Oriented Programing)
* setiap class yang dibuat didalam file java mewakili suatu objecet*/

public class Basic {
    // Method main : blok kode yang akan mengeksekusi suatu perintah
    public static void main(String[] args) {
        // variabel : buat wadah penyimpanan data
        // tipe data : jenis data yang disimpan didalam variabel
        /* cara buat variabel :
        * <tipe data> <nama variable = isi data> */
        String name = "Ridho";  // string
        int age =  25; // integer
        Boolean isStudent = false; // boolean

        // system.out.println : buat nampilin output ke terminal
        System.out.println("nama aku : " + name + " umurku :" + age + " dan status siswaku: " + "isStudent");

        // array dijava punya ukuran data uang statis, gabisa sembarangan ubah (tambah datanya)
        System.out.println("==== ARRAY ====");
        int[] numbers = {1,2,3,4,5};
        System.out.println("Array length : " + numbers.length);
        numbers[4] = 7;

        // di java untuk menampilkan object dan array harus dilooping
        //looping tradisional
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("array ke - " + i);
        }

        // Integer : tipe datanya bisa dimanipulasi pake mehtode-methode array
        Integer integerNumber = 25;
        System.out.println("Integer : " + integerNumber);

        //object : tipe data campuran
        Object[] dataCampuran = {"ridho", 25};
        // enchanced looping
        for (Object i : dataCampuran) {
            System.out.println("dataCampuran : " + i);
        }

        //tipe data angka yang ukuran/kapasitasnya lebih besar dibanding int
        long longNumber = 123;
        System.out.println(longNumber);

        //tipe data untuk nilai pecahan
        double doubleNumber = 10.2;
        float floatNumber =10;

        // concatenation : method untuk gabungin 2 string
        String firstName = "Zain";
        String lastName = "Dina";
        System.out.println("basic : " + firstName + " " + lastName);
        System.out.println("concat : " + firstName.concat(lastName));

        // ENUM: untuk menyimpan nilai nilai konstan yang gabisa diubah
        enum Grade {
            LULUS,
            TIDAK_LULUS
        }
        System.out.println("status kelulusan anda : " + Grade.LULUS);
    }
}
