package day2.OOP;

import day2.OOP.Blogs.Blog;
import day2.OOP.Student.Student;
import day2.OOP.Users.Admin;
import day2.OOP.Users.User;

public class Main {
    public static void main(String[] args) {
        // Class biasa
        System.out.println("==== get student ====");
        Student s1 = new Student("Imrong",70);
        s1.cekStatus();

        Student s2 = new Student("ridho", 95);
        s2.name="Ridho";
        s2.score=90;
        s2.cekStatus();

        // Class Enkapsulasi
        System.out.println("=== get blog =====");
        Blog myblog = new Blog("BOOTCAMP AIGEN BATCH 3", "Hello, world! This is my blog! :D");
        myblog.displayInfo();
        myblog.getTitle();
        myblog.setTitle("BOOTCAMP AIGEN BATCH 3");
        myblog.setContent("Pendaftaran ditutup");
        myblog.displayInfo();

        myblog.addComment("Ridho", "Nice blog!");
        myblog.addComment("maruf", "Nice blog!");
        myblog.displayComments();

        System.out.println("=== Get Users ====");
        User userGuest = new User("Imronk");
        userGuest.displayInfo();

        Admin userAdmin = new Admin("Zaink", true);
        userAdmin.displayInfo();
    }
}
