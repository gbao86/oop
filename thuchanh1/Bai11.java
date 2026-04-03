package thuchanh1;

import java.util.Scanner;
//Bài 11: Đảo ngược số nguyên đầu vào
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();
        
        System.out.println("Số đảo ngược là: " + daoNguoc(n));
    }

    public static int daoNguoc(int n) {
        int ketQua = 0;
        while (n != 0) {
            ketQua = ketQua * 10 + n % 10;
            n /= 10;
        }
        return ketQua;
    }
}