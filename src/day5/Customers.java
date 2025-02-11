package day5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.*;
import java.util.Scanner;

public class Customers {

    String url = "jdbc:postgresql://localhost:5433/test";
    String username = "postgres";
    String password = "root";
    Scanner input = new Scanner(System.in);

    public void getData(){
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet= statement.executeQuery("SELECT * FROM customers");
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

    public void addData(){
        System.out.print("Masukkan nama customers : ");
        String user_name = input.nextLine();

        System.out.print("Masukkan alamat customers : ");
        String address = input.nextLine();

        try{
            Connection connection= DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement= connection.prepareStatement("insert into customers(user_name,address) values(?, ?)");
            preparedStatement.setString(1, user_name);
            preparedStatement.setString(2, address);
            preparedStatement.executeUpdate();
            System.out.println("Customers berhasil ditambahkan");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editData(){
        System.out.print("Masukkan id customers : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan alamat customers : ");
        String address = input.nextLine();


        try{
            Connection connection= DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement= connection.prepareStatement("update customers set address = ? where id = ?");

            preparedStatement.setString(1, address);
            preparedStatement.setInt(2, id);

            int rowUpdated = preparedStatement.executeUpdate();
            if (rowUpdated > 0){
                System.out.println("Customers berhasil di update!");
            }else {
                System.out.println("Customers dengan id = "+ id + "tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteData(){
        System.out.print("Masukkan id customers : ");
        int id = input.nextInt();
        input.nextLine();

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement("delete from customers where id = ?");
            preparedStatement.setInt(1, id);
            int customersDeleted = preparedStatement.executeUpdate();
            if (customersDeleted > 0){
                System.out.println("Data customers berhasil dihapus!");
            }else {
                System.out.println("Data customers dengan id =" +id+"tidak ditemukan!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
