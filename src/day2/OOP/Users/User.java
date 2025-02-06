package day2.OOP.Users;

//INHERITANCE : konsep untuk menurunkan sifat/perilaku parent class ke child class
// artinya class turunannya bisa menggunakan properti dan method milik parent
// child class (Inheritance ditandai dengan kata kunci extends)

public class User {
    private String username;

    public User(String Uname){username = Uname;}

    public String getUsername(){return username;}
    public void displayInfo(){
        System.out.println("Username : "+ username);
    }
}
