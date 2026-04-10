package thuchanh2;
import java.util.Scanner;

// Bài 2: Thao tác trên ma trận (bao gồm nhập, xuất, cộng hai ma trận, nhân hai ma trận)
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so dong: ");
        int r = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        
        System.out.println("Nhap ma tran A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ma tran A vua nhap:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Nhap ma tran B (cung kich thuoc A):");
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Ket qua Ma tran A + B la:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Nhap so cot cua ma tran tiep theo (k): ");
        int k = sc.nextInt();
        int[][] d = new int[c][k]; 
        int[][] res = new int[r][k];
        System.out.println("Nhap ma tran D (" + c + "x" + k + "):");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < k; j++) d[i][j] = sc.nextInt();
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < c; l++) {
                    res[i][j] += a[i][l] * d[l][j];
                }
            }
        }

        System.out.println("Ket qua Ma tran A * D la:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}