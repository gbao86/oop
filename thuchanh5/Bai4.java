package thuchanh5;

public class Bai4 {
    public static void main(String[] args) {
        Student student = new Student("Pham Ho Cong Toai", "TP.HCM", "Nam", 9.5);

        Student.StudentOperation operation = student.new StudentOperation();
        operation.print();
        System.out.println("Xep loai: " + operation.type());
    }
}

class Student {
    private String name;
    private String address;
    private String sex;
    private double score;

    public Student(String name, String address, String sex, double score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }

    public class StudentOperation {
        public void print() {
            System.out.println("Student [" + name + "," + address + "," + sex + "," + score + "]");
        }

        public String type() {
            if (score > 8) {
                return "A";
            } else if (score >= 5) {
                return "B";
            } else {
                return "C";
            }
        }
    }
}
