package thuchanh1;
import java.util.Scanner;
//Bài 3: Chuyển nhiệt độ từ độ F sang độ C
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ F: ");
        double doF = sc.nextDouble();
        double doC = (doF - 32) / 1.8;
        
        System.out.println("Nhiệt độ C: " + doC);
    }
}