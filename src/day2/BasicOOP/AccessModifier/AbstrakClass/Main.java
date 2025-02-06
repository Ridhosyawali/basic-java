package day2.BasicOOP.AccessModifier.AbstrakClass;

public class Main {
    public static void main(String[] args) {
        // bikin objek dari turunan class Hewan
        Kucing kucingOyen = new Kucing("Oyen", 2);

        // akses method
        kucingOyen.makan();
        kucingOyen.tidur();

        // akses getter
        System.out.println("Nama Kucing : " + kucingOyen.getNama());
        System.out.println("Umur Kucing : " + kucingOyen.getUmur());
    }
}
