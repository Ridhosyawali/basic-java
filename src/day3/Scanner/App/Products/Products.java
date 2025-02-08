package day3.Scanner.App.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Products {
    public String name;
    public double price;
    public String category;

    public Products(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category=category;

    }

    // inner class
    public static class ProductController{
        private final List<Products> productList;

        public ProductController(){
            productList = new ArrayList<>();
        }

        // method
        public void addProduct(Products product){productList.add(product);}
        public void displayAllProducts(){
            if(!productList.isEmpty()){
                // ini untuk mengurutkan harga terbesar ke terendah
                for (Products product : productList){
                    System.out.println("nama: "+product.name+", price: "+product.price+", category: "+product.category);
                }
            }else {
                System.out.println("Product tidak tersedia");
            }
        }

        public void sortByItemAscending(){
            productList.sort((p1, p2) -> Double.compare(p2.price, p1.price));
            System.out.println("Product diurutkan dari harga terendah ke tertinggi");
            displayAllProducts();
        }

        public void sortByItemDescending(){
            productList.sort((p1, p2) -> Double.compare(p1.price, p2.price));
            System.out.println("Product diurutkan dari harga tertinggi ke terendah");
            displayAllProducts();
        }

        public Optional<Products> findProductByName(String productName) {
            return productList.stream()
                    .filter(product -> product.name.equalsIgnoreCase(productName))
                    .findFirst();
        }

        public void saveProduct(){
            String fileName = "C:\\Users\\Ridho Syawali\\Downloads\\backend\\basic_java\\src\\day3\\Scanner\\App\\Products\\products.txt";
            File file = new File(fileName);

            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
               for (Products p : productList){
                   writer.write((productList.indexOf(p) + 1) + ". " + p.name + ", " + p.price + ", " + p.category + "\n");

               }
                System.out.println("File Berhasil disimpan");
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        public void readProduct(){
            String filePath = "C:\\Users\\Ridho Syawali\\Downloads\\backend\\basic_java\\src\\day3\\Scanner\\App\\Products\\products.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                for (String line; (line = reader.readLine()) != null;){
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
