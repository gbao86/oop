package thuchanh2;
import java.util.Scanner;

// Bài 1: Thao tác trên mảng một chiều các số nguyên (bao gồm nhập, xuất, tìm kiếm, tìm giá trị lớn nhất, nhỏ nhất và sắp xếp)
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Mang vua nhap: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        System.out.print("Nhap so x can tim: ");
        int xFind = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == xFind) {
                System.out.println("Vi tri cua " + xFind + " la: " + i);
            }
        }

        int max = arr[0];
        int min = arr[0];
        int posMax = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                posMax = i;
            }
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Gia tri lon nhat: " + max + " tai vi tri " + posMax);
        System.out.println("Gia tri nho nhat: " + min);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Mang sau khi sap xep: ");
        for (int x : arr) System.out.print(x + " ");
    }
}