package day2.BasicOOP;

import day2.BasicOOP.Basic.*;

public class Main {
    public static void main(String[] args) {
        // instance creation dari class Human : proses bikin objek baru dari sebuah class
        Human student = new Human("ridho ", 25);

        // instance method: method yang bisa diakses oleh objek yang menampung suatu class
        student.fart();
        student.breath();
    }
}
