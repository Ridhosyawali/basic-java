package day3.Scanner.App.Home;

import day3.Scanner.App.Products.ProductMain;
import day3.Scanner.App.Reviewer.Review;
import day3.Scanner.App.Reviewer.ReviewMain;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===MENU===");
        System.out.println("- Login");
        System.out.println("- Register");
        System.out.println("- Product");
        System.out.println("- Cart");
        System.out.println("- Review");
        System.out.print("Pilih menu : ");
        Menu myMenu = Menu.valueOf(input.nextLine().toUpperCase());

        switch (myMenu){
            case LOGIN :
                System.out.println("Login Success");
                break;

            case REGISTER:
                System.out.println("Register Success");
                break;
            case PRODUCT:
                ProductMain.main(args);
                break;
            case CART :
                System.out.println("Navigate to Cart Success");
                break;
            case REVIEW:
                // buat menu review yang bisa menambahkan reviewer dan rating(int) , kemudian tampilkan reviewnya
                ReviewMain.main(args);
                break;
        }
    }
}
