package tuan2;

// Tính tổng các số nguyên dương chẵn từ 1 đến n, dùng for
import java.util.Scanner;
public class BT7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        System.out.print("Nhập n: ");
        int n = k.nextInt();
        
        int tChan = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                tChan = tChan + i;
            }
        }
        
        System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + tChan);
    }
}
