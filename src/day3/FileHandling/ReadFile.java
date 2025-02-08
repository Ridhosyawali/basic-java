package day3.FileHandling;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        // gunakan absolute path (path lengkap) untuk mengakses file
        String filePath = "C:\\Users\\Ridho Syawali\\Downloads\\backend\\basic_java\\src\\day3\\FileHandling\\test.txt";
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
//        String line;
//        while ((line = reader.readLine()) != null){
//            System.out.println(line);
//        }
        for (String line; (line = reader.readLine()) != null;){
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
