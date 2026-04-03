package thuchanh1;

import java.util.Scanner;
//Bài 5: Tìm giá trị nhỏ nhất giữa ba số
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 3 số nguyên: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}