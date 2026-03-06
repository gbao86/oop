package tuan7;

class Bank {
    int getRate() { return 0; }
}

class SBI extends Bank {
    int getRate() { return 8; }
}

class ICICI extends Bank {
    int getRate() { return 7; }
}

class AXIS extends Bank {
    int getRate() { return 9; }
}

public class BT5_tuan7 {
    public static void main(String args[]) {
        Bank b; 
        
        b = new SBI();
        System.out.println("Lai suat SBI: " + b.getRate() + "%");

        b = new ICICI();
        System.out.println("Lai suat ICICI: " + b.getRate() + "%");
        
        b = new AXIS();
        System.out.println("Lai suat AXIS: " + b.getRate() + "%");
    }
}

