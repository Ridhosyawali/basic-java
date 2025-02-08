package day3.FileHandling;

import java.io.*;

public class EditFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Ridho Syawali\\Downloads\\backend\\basic_java\\src\\day3\\FileHandling\\testWrite.txt";
        File file = new File(fileName);

        // buat konten baru setelah pengeditan
        StringBuilder newContent = new StringBuilder();

        //cek
        if(file.exists()){
            // BACA DULU FILENYA
            try(BufferedReader reader = new BufferedReader(new FileReader(file))){
                for (String line; (line = reader.readLine()) != null;){
                    // REPLACE KATA PROGRAMMER JADI BADUT
                    line = line.replace("Ridho!", "badut");
                    newContent.append(line).append(System.lineSeparator());
                }
            }catch (IOException e){
                e.printStackTrace();
            }

            //TULIS KONTEN YANG DIEDIT KE FILE YANG SAMA
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                writer.write(newContent.toString());
                // ini buat nambahin konten baru
                writer.append("123456").append(System.lineSeparator());
                System.out.println("File berhasil diedit\n path: "+file.getAbsoluteFile());
            }catch (IOException e){
                e.printStackTrace();
            }
        } else {
            System.out.println("File tidak ditemukan\n path : "+file.getAbsoluteFile());
        }
    }
}
