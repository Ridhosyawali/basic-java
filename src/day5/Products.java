package day5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.*;
import java.util.Scanner;

public class Products {

    String url = "jdbc:postgresql://localhost:5433/test";
    String username = "postgres";
    String password = "root";
    Scanner input = new Scanner(System.in);

    public void getData(){
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet= statement.executeQuery("SELECT * FROM products");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            ObjectMapper mapper = new ObjectMapper();
            ArrayNode arrNode = mapper.createArrayNode();

            while(resultSet.next()){
                ObjectNode objNode = mapper.createObjectNode();
                for (int i = 1; i <= columnCount ; i++) {
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName,resultSet.getString(i));
                }
                arrNode.add(objNode);

            }
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrNode);
            System.out.println(jsonString);
        }catch (SQLException | com.fasterxml.jackson.core.JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean isValidCategoryId(int categoryId) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM categories WHERE id = ?");
            preparedStatement.setInt(1, categoryId);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addData(){
        System.out.print("Masukkan nama product : ");
        String product_name = input.nextLine();

        System.out.print("Masukkan harga product : ");
        double product_price  = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan id kategori product : ");
        int category_id = input.nextInt();

        if (!isValidCategoryId(category_id)) {
            System.out.println("Kategori id tidak tersedia");
            return;
        }

        try{
            Connection connection= DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement= connection.prepareStatement("insert into products(product_name,product_price,category_id) values(?, ?, ?)");
            preparedStatement.setString(1, product_name);
            preparedStatement.setDouble(2, product_price);
            preparedStatement.setInt(3, category_id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editData(){
        System.out.print("Masukkan id product : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan harga product : ");
        double price  = input.nextDouble();
        input.nextLine();

        try{
            Connection connection= DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement= connection.prepareStatement("update products set  product_price = ? where id = ?");

            preparedStatement.setDouble(1, price);
            preparedStatement.setInt(2, id);

            int rowUpdated = preparedStatement.executeUpdate();
            if (rowUpdated > 0){
                System.out.println("Product berhasil di update!");
            }else {
                System.out.println("Product dengan id = "+ id + "tidak ditemukan");
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
                System.out.println("Data product berhasil dihapus!");
            }else {
                System.out.println("Data product dengan id =" +id+"tidak ditemukan!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
