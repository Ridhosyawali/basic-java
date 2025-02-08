package day3.Scanner.App.Reviewer;

import java.util.ArrayList;
import java.util.List;

public class Review {
    public String name;
    public double rating;

    public Review(String name, double price){
        this.name = name;
        this.rating = price;

    }

    public static class ReviewController{
        private final List<Review> reviewList;

        public ReviewController(){
            reviewList = new ArrayList<>();
        }

        // method
        public void addReview(Review product){reviewList.add(product);}
        public void displayAllReviews(){
            if(!reviewList.isEmpty()){
                // ini untuk mengurutkan harga terbesar ke terendah
                for (Review product : reviewList){
                    System.out.println("nama: "+product.name+", price: "+product.rating);
                }
            }else {
                System.out.println("Product tidak tersedia");
            }
        }
    }


}
