package day2.OOP.Users;

// ini adlaah class impplementasi dari inheritance
// child class Admin inherit from parent class User
public class Admin extends User {
    private boolean isAdmin;

    public Admin(String username, boolean role){
        super(username); // Memanggil variabel milik class parent(User)
        isAdmin = role;
    }

    // overWrite method si parent
    @Override
    public void displayInfo(){
        System.out.println("Admin username : " + getUsername());
        System.out.println("Is Admin : " + isAdmin);
    }
}
