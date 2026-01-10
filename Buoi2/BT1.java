package Buoi2;

import java.util.Scanner;
public class BT1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Nhập điểm của sinh viên: ");
        double diem = a.nextDouble();

        if (diem >= 0 && diem < 5) {
            System.out.println("Học lực: Yếu");
        } else if (diem >= 5 && diem < 7) {
            System.out.println("Học lực: Trung bình");
        } else if (diem >= 7 && diem <= 8) {
            System.out.println("Học lực: Khá");
        } else if (diem > 8 && diem <= 10) {
            System.out.println("Học lực: Giỏi");
        } else {
            System.out.println("Điểm nhập vào không hợp lệ (phải từ 0 đến 10)");
        }

        a.close();
    }
}
