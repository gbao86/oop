package tuan2;

// Tính tổng từ 1 đến n, dùng vòng lặp for
import java.util.Scanner;
public class BT5 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n: ");
        int n = u.nextInt();
        
        int t = 0;
        for (int i = 1; i <= n; i++) {
            t = t + i;
        }
        
        System.out.println("Tổng từ 1 đến " + n + " là: " + t);
    }
}
