package thuchanh1;

import java.util.Scanner;
//Bài 6: Kiểm tra tam giác hợp lệ
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 3 cạnh của tam giác: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Đây là một tam giác hợp lệ.");
        } else {
            System.out.println("Đây không phải là tam giác hợp lệ.");
        }
    }
}