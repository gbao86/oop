package thuchanh1;

import java.util.Scanner;
//Bài 15: Tách ngày, tháng và năm
public class Bai15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập ngày theo định dạng (dd/mm/yyyy): ");
            String chuoiNgay = sc.nextLine();
            
            String[] phanTach = chuoiNgay.split("/");
            
            if (phanTach.length == 3) {
                System.out.println("Ngày: " + phanTach[0]);
                System.out.println("Tháng: " + phanTach[1]);
                System.out.println("Năm: " + phanTach[2]);
            } else {
                System.out.println("Vui lòng nhập đúng định dạng có dấu gạch chéo '/'");
            }
        }
    }
}