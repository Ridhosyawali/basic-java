package day2.DownCasting;

/* Downcasting : mengubah superclass/parent menjadi subclass/child class
* biar bisa pakai method/atribut yng spesifik dari subclass */

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(); // buat objek admin
        Guest guest = new Guest();
        User user1 = admin; // buat objek user
        User user2 = guest;

        Admin admin1 = (Admin) user1; // downcasting User ke admin
        admin1.adminStatus(); // method yang ingin dipakai superclass
        admin1.login(); // method yang masih bisa dipakai superclass walaupun sudah di downcast

        Guest guest1 = (Guest) user2;
        guest1.guestStatus();
    }
}
