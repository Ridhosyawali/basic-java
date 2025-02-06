package day2.DownCasting;

//Super class / parent class
public class User {
    void login(){
        System.out.println("login success!");
    }
}

class Admin extends User{
    void adminStatus(){
        System.out.println("Hi, Admin");
    }
}

class Guest extends User{
    void guestStatus(){
        System.out.println("Hi, Guest");
    }
}