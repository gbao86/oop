package thuchanh1;

import java.util.Scanner;
//Bài 7: Tính tỷ lệ phần trăm và xếp hạng 5 môn
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm Lý, Hóa, Sinh, Toán, Máy tính: ");
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        double sinh = sc.nextDouble();
        double toan = sc.nextDouble();
        double mayTinh = sc.nextDouble();

        double tongDiem = ly + hoa + sinh + toan + mayTinh;
        double tyLe = (tongDiem / 50) * 100; 

        System.out.println("Tỷ lệ phần trăm: " + tyLe + "%");

        if (tyLe > 90) {
            System.out.println("Hạng A");
        } else if (tyLe > 80) {
            System.out.println("Hạng B");
        } else if (tyLe > 70) {
            System.out.println("Hạng C");
        } else if (tyLe > 60) {
            System.out.println("Hạng D");
        } else if (tyLe > 40) {
            System.out.println("Hạng E");
        } else {
            System.out.println("Hạng F");
        }
    }
}