package day1.Logic;

public class LogicStatement {
    public static void main(String[] args) {
        int nilai = 10;

        // if
        if (nilai == 10){
            System.out.println("Nilaimu Bagus : ");
        }

        // if - else
        int nilaiSiswa = 75;
        if (nilaiSiswa >= 60) {
            System.out.println("lulus ente");
        }else{
            System.out.println("Dropout");
        }

        // if - else - if
        if (nilaiSiswa >= 90) {
            System.out.println("Nilai A");
        } else if (nilaiSiswa >= 80) {
            System.out.println("Nilai B");
        } else {
            System.out.println("Nilai C");
        }

        //switch case
        String grade = "B";
        switch (grade){
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("Nilai tidak baik");
                break;
            case null, default:
                System.out.println("Nilai tidak Valid");
        }
    }
}
