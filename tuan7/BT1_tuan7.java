package tuan7;

abstract class HinhHoc {
    public abstract void tinhDienTich();
}

class HinhTron extends HinhHoc {
    public double banKinh;

    @Override
    public void tinhDienTich() {
        System.out.println("Diện tích hình tròn: " + (Math.PI * banKinh * banKinh));
    }
}

class HinhChuNhat extends HinhHoc {
    public double dai, rong;

    @Override
    public void tinhDienTich() {
        System.out.println("Diện tích hình chữ nhật: " + (dai * rong));
    }
}

public class BT1_tuan7 {
    public static void main(String[] args) {
        HinhTron tron = new HinhTron();
        tron.banKinh = 5;

        HinhChuNhat nhat = new HinhChuNhat();
        nhat.dai = 10;
        nhat.rong = 4;

        tron.tinhDienTich();
        nhat.tinhDienTich();
    }
}
