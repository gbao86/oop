package thuchanh5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bai3 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("thuchanh5/input.txt"));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            String upperContent = content.toString().toUpperCase();

            FileWriter writer = new FileWriter("thuchanh5/output.txt");
            writer.write(upperContent);
            writer.close();

            System.out.println("Da chuyen doi va ghi vao thuchanh5/output.txt thanh cong.");

        } catch (IOException e) {
            System.out.println("Loi khi xu ly file: " + e.getMessage());
        }
    }
}