package day3.Scanner.App.Products;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Products.ProductController productController= new Products.ProductController();

        Scanner input = new Scanner(System.in);
        System.out.println("===PRODUCT LIST===");
        productController.displayAllProducts();
        System.out.println("==================");

        System.out.print("Apakah anda ingin menambahkan product baru? (Y/N) :");
        String addProductChoice = input.nextLine().toLowerCase();

        if(addProductChoice.equals("y")){
            System.out.println("Masukkan jumlah product : ");
            int jumlahProduct = input.nextInt();
            input.nextLine();

            for (int i =0; i < jumlahProduct; i++){
                System.out.println("data data produk ke-"+(i+1));
                System.out.print("Nama : ");
                String nama = input.nextLine();
                System.out.print("harga : ");
                double harga = input.nextDouble();
                input.nextLine();
                System.out.print("kategori : ");
                String kategori = input.nextLine();

                Products products = new Products(nama,harga,kategori);

                productController.addProduct(products);
            }
        }

        productController.displayAllProducts();
        System.out.println("==================");

        System.out.println("===SORT PRODUCT LIST===");
        //sort method
        productController.sortByItemAscending();
        System.out.println();
        productController.sortByItemDescending();
        System.out.println("=======================");

        System.out.println("Apakah anda ingin mencari product? (Y/N)");
        //method & logic untuk mencari product berdasarkan nama
        String searchProduct = input.nextLine().toLowerCase();
        if(searchProduct.equals("y")) {
            System.out.println("Masukkan nama product : ");
            String productName = input.nextLine();
            if (productController.findProductByName(productName).isPresent()) {
                System.out.println("Product ditemukan");
                Products product = productController.findProductByName(productName).get();
                System.out.println("Nama : " + product.name);
                System.out.println("Harga : " + product.price);
                System.out.println("Kategori : " + product.category);
            } else {
                System.out.println("Product tidak ditemukan");
            }
        }

        //Save product ke file (write)
        System.out.println("Apakah anda ingin menyimpan data? (Y/N)");
        String saveProduct = input.nextLine().toLowerCase();
        if (saveProduct.equals("y")) {
            productController.saveProduct();
        }else {
            System.out.println("Data tidak disimpan");
        }

        //buat method read file product
        System.out.println("Apakah anda ingin membaca data product? (Y/N)");
        String readProduct = input.nextLine().toLowerCase();
        if (readProduct.equals("y")) {
            System.out.println("Berikut adalah data product :");
            productController.readProduct();
        }else {
            System.out.println("Data tidak disimpan");
        }
    }
}
