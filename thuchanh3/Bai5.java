package thuchanh3;

class Employee {
    private String id;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private int numDaysOff;

    public Employee() {
        this.id = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    public Employee(String id, String fullName, double coefficientsSalary) {
        this.id = id;
        this.fullName = fullName;
        this.yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = 0;
    }

    public Employee(String id, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.id = id;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    public double getSenioritySalary() {
        int currentYear = 2026; 
        int yearsOfWork = currentYear - yearJoined;
        if (yearsOfWork >= 5) {
            return (yearsOfWork * 1150.0) / 100.0; 
        }
        return 0;
    }

    public String considerEmulation() {
        if (numDaysOff <= 1) return "A";
        if (numDaysOff <= 3) return "B";
        return "C";
    }

    public double getSalary() {
        double basicSalary = 1150.0;
        double emulCoeff = 1.0;
        String rank = considerEmulation();

        if (rank.equals("A")) emulCoeff = 1.0; 
        else if (rank.equals("B")) emulCoeff = 0.75;
        else emulCoeff = 0.5; 

        return basicSalary * coefficientsSalary * emulCoeff + getSenioritySalary();
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Employee e = new Employee("NV01", "Trinh Gia Bao", 2018, 2.0, 1);
        System.out.println("Xep loai: " + e.considerEmulation());
        System.out.println("Luong: " + e.getSalary());
    }
}