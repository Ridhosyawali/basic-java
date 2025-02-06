package day2.OOP.Test;

public class Student {
    public String name;
    public int Nim;
    public double score;

    public Student(String studentName, int studentNim, double studentScore) {
        this.name = studentName;
        this.Nim = studentNim;
        this.score = studentScore;
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + Nim);
        System.out.println("Nilai: " + score);
    }





}
