package day2.UpCasting;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        User user1 = admin; // memanggil method admin ke user

        user1.login(); // memanggil method dari superclass
        //user1.adminStatus(); //error karna efek upcast
    }
}
