package day4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.*;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;


public class DemoCRUD {
    // connect to database
    String url = "jdbc:postgresql://localhost:5433/bootcamp";
    String username = "postgres";
    String password = "root";
    Scanner input = new Scanner(System.in);

    public void getData(){
        try {
            //DriverManager.getConnection digunakan untuk menghubungkan ke database
            Connection connection = DriverManager.getConnection(url, username, password);
            //panggil objek Statement untuk mengeksekusi query
            Statement statement = connection.createStatement();
            // panggil ResultSet unttuk menampung hasil eksekusi query
            ResultSet resultSet= statement.executeQuery("SELECT * FROM products");

            // mengambil tipe dari tiap kolom
            ResultSetMetaData metaData = resultSet.getMetaData();
            // ambil jumlah kolom
            int columnCount = metaData.getColumnCount();

            // OBJECTMapper : maping data ke format JSON
            ObjectMapper mapper = new ObjectMapper(); // disini kita buat object kosong
            // ArrayNode buat nampung data ke array of object(JSON)
            ArrayNode arrNode = mapper.createArrayNode(); // lalu bikin array kosong

            // looping tiap baris
            while(resultSet.next()){
                // buat data object dari tiap baris
                ObjectNode objNode = mapper.createObjectNode();
                for (int i = 1; i <= columnCount ; i++) {
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName,resultSet.getString(i));
                }
                // masukin data object yang udah dilooping ke array
                arrNode.add(objNode);

            }
            //untuk format data ke format JSON yang lebih rapih
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrNode);
            System.out.println(jsonString);
        }catch (SQLException | com.fasterxml.jackson.core.JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void addData(){
        System.out.print("Masukkan nama product : ");
        String name = input.nextLine();

        System.out.print("Masukkan harga product : ");
        double price  = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan kategori product : ");
        String category = input.nextLine();

        try{
            Connection connection= DriverManager.getConnection(url, username, password);
            // preparedStatement berfungsi untuk mengeksekusi query yang punya jumlah data banyak. (?,?,?) pada values buat cegah sql injection
            PreparedStatement preparedStatement= connection.prepareStatement("insert into products (product_name, product_price, category) values(?, ?, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setString(3, category);

            preparedStatement.executeUpdate();
            System.out.println("Product berhasil ditambahkan");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editData(){
        System.out.print("Masukkan id product : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan nama product : ");
        String name = input.nextLine();

        System.out.print("Masukkan harga product : ");
        double price  = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan kategori product : ");
        String category = input.nextLine();

        try{
            Connection connection= DriverManager.getConnection(url, username, password);
            // preparedStatement berfungsi untuk mengeksekusi query yang punya jumlah data banyak. (?,?,?) pada values buat cegah sql injection
            PreparedStatement preparedStatement= connection.prepareStatement("update products set product_name = ?, product_price = ?, category = ? where id = ?");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setString(3, category);
            preparedStatement.setInt(4, id);

            //eksekusi query
            int rowUpdated = preparedStatement.executeUpdate();
            // kondisi untuk mengecek apa ada data yang diupdate
            if (rowUpdated > 0){
                System.out.println("Data berhasil di update!");
            }else {
                System.out.println("Data dengan id = "+ id + "tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteData(){
        System.out.print("Masukkan id product : ");
        int id = input.nextInt();
        input.nextLine();

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement("delete from products where id = ?");
            preparedStatement.setInt(1, id);
            int productDeleted = preparedStatement.executeUpdate();
            if (productDeleted > 0){
                System.out.println("Data berhasil dihapus!");
            }else {
                System.out.println("Data dengan id =" +id+"tidak ditemukan!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getOrderProducts(){
        System.out.print("Masukkan id product : ");
        int product_id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan quantity : ");
        int quantity = input.nextInt();

        try {
            //DriverManager.getConnection digunakan untuk menghubungkan ke database
            Connection connection= DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement= connection.prepareStatement("insert into orders (product_id, order_date, quantity) values(?, ?, ?)");
            preparedStatement.setInt(1, product_id);
            preparedStatement.setDate(2, Date.valueOf(String.valueOf(LocalDate.now())));
            preparedStatement.setInt(3,quantity);

            int product_order = preparedStatement.executeUpdate();

            if (product_order > 0){
                System.out.println("Data berhasil di tambahkan");
            } else {
                System.out.println("Data gagal ditambahkan");
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DemoCRUD demo = new DemoCRUD();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("======MENU======");
            System.out.println("1. View all products");
            System.out.println("2. Add new products");
            System.out.println("3. Edit products");
            System.out.println("4. delete products");
            System.out.println("5. order products");
            System.out.println("0. Exit");
            System.out.println("Pilih menu : ");
            int menu = input.nextInt();
            input.nextLine();

            switch(menu) {
                case 1:
                    demo.getData();
                    break;
                case 2:
                    demo.addData();
                    break;
                case 3:
                    demo.editData();
                    break;
                case 4:
                    demo.deleteData();
                    break;
                case 5:
                    demo.getOrderProducts();
                    break;
                case 0 :
                    System.out.println("Thank you, have a good day!");
                    input.close();
                    return;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }
}
