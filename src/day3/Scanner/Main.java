package day3.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //import scanner dari java buat bikin inputan ke terminal
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.println("Umur : ");
        int umur = input.nextInt();
        input.nextLine(); // untuk membuat karakter \n setelah membaca inputan khusus angka
        System.out.println("Kelas : ");
        String kelas = input.nextLine();


        System.out.println("Hallo, " + nama + " umur : " + umur + " kelas : " + kelas);

        // buat nutup inputan
        input.close();
    }
}
