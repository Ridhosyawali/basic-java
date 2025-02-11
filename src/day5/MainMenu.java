package day5;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Products products = new Products();
        Customers customers = new Customers();
        Scanner input = new Scanner(System.in);

        // Menu
        while(true){
            System.out.println("=====HOME=====");
            System.out.println("1. Menu Produk");
            System.out.println("2. Menu Customer");
            System.out.println("0. Exit");
            System.out.println("==============");
            System.out.print("Pilih menu : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu){
                case 1:
                    while (true){
                        System.out.println("=====MENU PRODUK=====");
                        System.out.println("1. Tambah Produk");
                        System.out.println("2. Update Produk");
                        System.out.println("3. Hapus Produk");
                        System.out.println("4. Lihat Produk");
                        System.out.println("0. Exit");
                        System.out.println("==============");
                        System.out.print("Pilih menu : ");
                        int menuProduk = input.nextInt();
                        input.nextLine();

                        switch (menuProduk){
                            case 1:
                                System.out.println("=====ADD PRODUCT======");
                                products.addData();
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("=====EDIT PRODUCT======");
                                products.editData();
                                System.out.println("======================");
                                break;
                            case 3:
                                System.out.println("=====DELETE PRODUCT======");
                                products.deleteData();
                                System.out.println("======================");
                                break;
                            case 4:
                                System.out.println("=====GET PRODUCT======");
                                products.getData();
                                System.out.println("======================");
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal...");
                                break;
                            default:
                                System.out.println("input tidak valid");
                                break;
                        }
                        if(menuProduk == 0) break;
                    }
                    break;
                case 2:
                    while (true){
                        System.out.println("=====MENU CUTOMER=====");
                        System.out.println("1. Tambah Customer");
                        System.out.println("2. Update Customer");
                        System.out.println("3. Hapus Customer");
                        System.out.println("4. Lihat Customer");
                        System.out.println("0. Exit");
                        System.out.println("==============");
                        System.out.print("Pilih menu : ");
                        int menuCustomer = input.nextInt();
                        input.nextLine();

                        switch (menuCustomer){
                            case 1:
                                System.out.println("=====ADD CUSTOMER======");
                                customers.addData();
                                System.out.println("======================");

                            case 2:
                                System.out.println("=====EDIT CUSTOMER======");
                                customers.editData();
                                System.out.println("======================");
                                break;
                            case 3:
                                System.out.println("=====DELETE CUSTOMER======");
                                customers.deleteData();
                                System.out.println("======================");
                                break;
                            case 4:
                                System.out.println("=====GET CUSTOMER======");
                                customers.getData();
                                System.out.println("======================");
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal...");
                                break;
                            default:
                                System.out.println("input tidak valid");
                                break;
                        }
                        if(menuCustomer == 0) break;
                    }
                    break;
                case 0:
                    System.out.println("Terimakasih, sampai jumpa!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Menu yang anda pilih tidak tersedia");
                    break;
            }
        }
    }
}