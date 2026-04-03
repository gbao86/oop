package thuchanh1;

import java.util.Scanner;
//Bài 14: Tách Họ, Tên đệm và Tên
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Họ và Tên: ");
        String hoTen = sc.nextLine().trim();
        
        int khoangTrangDau = hoTen.indexOf(" ");
        int khoangTrangCuoi = hoTen.lastIndexOf(" ");
        
        if (khoangTrangDau == -1) {
            System.out.println("Họ: " + hoTen);
            System.out.println("Tên đệm: Không có");
            System.out.println("Tên: Không có");
        } else {
            String ho = hoTen.substring(0, khoangTrangDau);
            String ten = hoTen.substring(khoangTrangCuoi + 1);
            String dem = hoTen.substring(khoangTrangDau + 1, khoangTrangCuoi).trim();
            
            System.out.println("Họ: " + ho);
            System.out.println("Tên đệm: " + (dem.isEmpty() ? "Không có" : dem));
            System.out.println("Tên: " + ten);
        }
    }
}