package thuchanh1;

import java.util.Scanner;
//Bài 4: Kiểm tra năm nhuận
public class Bai4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập năm cần kiểm tra: ");
            int nam = sc.nextInt();
            
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                System.out.println(nam + " là năm nhuận.");
            } else {
                System.out.println(nam + " không phải là năm nhuận.");
            }
        }
    }
}