package thuchanh1;

import java.util.Scanner;
//Bài 13: Đếm số từ trong chuỗi
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String chuoi = sc.nextLine().trim();
        
        if (chuoi.isEmpty()) {
            System.out.println("Số từ trong chuỗi: 0");
        } else {
            String[] cacTu = chuoi.split("\\s+");
            System.out.println("Số từ trong chuỗi: " + cacTu.length);
        }
    }
}