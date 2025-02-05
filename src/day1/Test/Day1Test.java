package day1.Test;

public class Day1Test {
    public static void main(String[] args) {
        /* 1. Buat logic untuk mengecek apakah sebuah bilangan adalah prima (1 nilai) */
        int bilangan ;
        int[] numbers = {1,2,3,4,5,6};
        for (int i = 0; i < numbers.length; i++) {
            bilangan= 0;
            for (int j=1; j <=i; j++){
                if(i%j==0){
                    bilangan = bilangan+1;
                }
            }
            if (bilangan == 2){
                System.out.println("bilangan prima : "+ i);
            }
        }


        /* 2. Buat Logic untuk mencari nilai terbesar dan terkecil dari sebuah array pake math method */
        int[] angka = {1,2,3,4,5,6,7,8,9,10};
        int max = angka[0];
        int min = angka[0];

        for ( int i : angka){
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        System.out.println("Nilai tertinggi : "+max);
        System.out.println("Nilai terendah"+min);


    /* 3. Buat logic untuk mencari jumlah elemen yang nilainya genap jumlah elemen yang
        nilainya ganjil dari array angka*/
        int number = angka[0];
        System.out.println("angka genap :");

        for (int i = 0; i < angka.length; i++) {
            if (i %2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("angka ganjil :");
        for (int i = 0; i < angka.length; i++) {
            if (i %2 != 0){
                System.out.println(i);
            }
        }

        /* 4. Buat logic untuk menghitung jumlah karakter dalam sebuah string*/
        String kata = "aku sedang belajar java";
        System.out.println("jumlah karakter : " + kata.length());

        /* 5. Buat logic untuk menghitung jumlah huruf vokal dalam string 'kata'*/
        int vocal = 0;
        char ch;
        for (int i = 0; i < kata.length(); i++) {
            ch = kata.charAt(i);
            if (ch=='a' || ch=='i'||ch=='u'||ch=='e'||ch=='o'){
                vocal++;
            }
        }
        if (vocal > 0){
            System.out.println("Jumlah huruf vocal : " + vocal);
        }

        /* 6. Buat array yang terdiri dari 5 siswa, masing masing punya 4 nilai : ujian, absen, kuis
         * kalkulasi nilai berdasarkan rata2 nilai dari 3 nilai tersebut
         * lalu tentukan grade mereka berdasarkan nilai rata rata menggunakan logic if-else dan enum*/
        int[][] mahasiswa = {
                {10,10,9},
                {6,9,9},
                {9,2,9},
                {9,3,9},
                {8,9,8},
        };
        enum grade {A,B,C,D,E,F}

        for (int i = 0; i < mahasiswa.length; i++) {
            int nilai = 0;
            System.out.println("Mahasiswa " + (i+1) + ":" );
            for (int j = 0; j < mahasiswa[i].length; j++) {
                nilai += mahasiswa[i][j];
            }
            int rata = nilai/3;
            if (rata >= 9){
                System.out.println(grade.A);
            } else if (rata >= 8) {
                System.out.println(grade.B);
            } else if (rata >= 7) {
                System.out.println(grade.C);
            }else if (rata >= 6) {
                System.out.println(grade.D);
            } else if (rata >= 5) {
                System.out.println(grade.E);
            } else {
                System.out.println(grade.F);
            }
        }
    }

}
