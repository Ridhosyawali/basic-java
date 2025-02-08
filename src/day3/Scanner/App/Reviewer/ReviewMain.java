package day3.Scanner.App.Reviewer;

import java.util.Scanner;

public class ReviewMain {
    public static void main(String[] args) {
        Review.ReviewController reviewController= new Review.ReviewController();
        Scanner input = new Scanner(System.in);

        System.out.println("===REVIEW LIST===");
        reviewController.displayAllReviews();
        System.out.println("==================");

        System.out.print("Apakah anda ingin menambahkan review baru? (Y/N) :");
        String addReviewChoice = input.nextLine().toLowerCase();

        if (addReviewChoice.equals("y")) {
            System.out.println("Masukkan jumlah review : ");
            int jumlahReview = input.nextInt();
            input.nextLine();

            for (int i=0; i < jumlahReview; i++){
                System.out.println();
                System.out.println("data review ke-"+(i+1));
                System.out.print("Nama : ");
                String reviewer = input.nextLine();
                System.out.print("Rating : ");
                int rating = input.nextInt();
                input.nextLine();

                Review review = new Review(reviewer, rating);

                reviewController.addReview(review);
            }
        }

        System.out.println();
        System.out.println("===REVIEW LIST===");
        reviewController.displayAllReviews();
        System.out.println("================");
    }
}
