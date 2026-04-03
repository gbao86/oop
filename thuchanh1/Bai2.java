package thuchanh1;

import java.util.Scanner;
//Bài 2: Tính diện tích hình chữ nhật
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();
        System.out.print("Nhập chiều cao: ");
        double chieuCao = sc.nextDouble();
        
        System.out.println("Diện tích: " + (chieuRong * chieuCao));
    }
}