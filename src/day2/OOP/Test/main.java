package day2.OOP.Test;

import java.util.ArrayList;

/* 1. Buat Object/class Student dengan  atribut nama, Nim dan Nilai
* Lalu simpan data student ke dalam ArrayList
* kemudian buat method untuk menghitung rata-rata nilai Student
* 1. menghitung nilai rata rata nilai student
* 2. mencari nilai tertinggi
* 3. tampilkan data student dengan nilai diatas rata rata*/
public class main {
    public static void main(String[] args) {
        System.out.println("=== test 1 ===");
        ArrayList<Student> dataStudent = new ArrayList<>();

        // Menambahkan data siswa ke ArrayList
        dataStudent.add(new Student("Zain", 422010038, 85));
        dataStudent.add(new Student("Maruf", 5231299, 80));
        dataStudent.add(new Student("Rizki", 12361769, 75));
        dataStudent.add(new Student("Fakri", 12345657, 90));

//        for (Student students: dataStudent){
//            students.displayInfo();
//        }

        double avg = averange(dataStudent);
        System.out.println("rata rata : "+ avg);

        double max= maxScore(dataStudent);
        System.out.println("Nilai Tertinggi :" + max);

        SiswaDiAtasRataRata(dataStudent);
    }

    // Methode rata rata
    public static double averange(ArrayList<Student> dataStudent) {
        double totalNilai = 0;
        for (Student students : dataStudent) {
            totalNilai += students.score;
        }
        return totalNilai / dataStudent.size();
    }

    // Methode nilai tertinggi
    public static double maxScore(ArrayList<Student> dataStudents){
        double nilaiTertinggi = 0;
        for (Student student : dataStudents) {
            if (student.score > nilaiTertinggi) {
                nilaiTertinggi = student.score;
            }
        }
        return nilaiTertinggi;
    }

    // Methode mencari nilai diatas rata rata
    public static void SiswaDiAtasRataRata(ArrayList<Student> dataStudent) {
        for (Student student : dataStudent) {
            if (student.score > averange(dataStudent)) {
                student.displayInfo();
            }
        }
    }
}
