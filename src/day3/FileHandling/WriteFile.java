package day3.FileHandling;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Ridho Syawali\\Downloads\\backend\\basic_java\\src\\day3\\FileHandling\\testWrite.txt";

        File file = new File(fileName);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write("Hello Aku Ridho!");
            writer.newLine(); // untuk membuat baris atau paraghraph baru
            writer.write("aku sedang belajar java");
            writer.newLine();

            System.out.println("=======================");
            // file.getAbsoluteFile() : untuk mendapatkan path lengkap file
            System.out.println("==File Berhasil dibuat==" + file.getAbsoluteFile());
            System.out.println("=======================");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
