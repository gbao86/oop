package tuan7;

class XeDap {
    public void run() {
        System.out.println("Xe đạp đang chạy bằng sức người (đạp chân)");
    }
}

class XeDapDien extends XeDap {
    @Override
    public void run() {
        System.out.println("Xe đạp điện đang chạy bằng động cơ pin");
    }
}

public class BT3_tuan7 {
    public static void main(String[] args) {
        XeDap xe1 = new XeDap();
        xe1.run();

        XeDapDien xe2 = new XeDapDien();
        xe2.run();
    }
}
