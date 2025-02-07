package day3.Equals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<User> listUser = new ArrayList<>();

    public void registerUser(User user){listUser.add(user);} // tambahkan user ke listUser

    //Validasi apakah user sudah terdaftar apa belum
    public void isUserRegistred(User user){
        if(listUser.contains(user)){
            System.out.println(user.getUsername() + "is Registered!");
        } else {
            System.out.println(user.getData() + " is not Registered!");
        }
    }

    public static void main(String[] args) {
        Main userController = new Main(); // membuat objek userController

        // register user baru
        User user1 = new User("ridho", "ridho@.com"); // membuat objek user1
        User user2 = new User("zain", "zain@.com"); // membuat objek user2
        userController.registerUser(user1); // tambahkan user1 ke listUser
        userController.registerUser(user2); // tambahkan user2 ke listUser

        // simulasi user yang belum terdaftar
        User userNotRegistred = new User("Imrok" , "imrok@.com"); // membuat objek userNotRegistred

        userController.isUserRegistred(user1); // validasi user1
        userController.isUserRegistred(user2); // validasi user2
        userController.isUserRegistred(userNotRegistred); // validasi userNotRegistred
    }
}
