package tuan7;

class Person {
    String name;
    String birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDetails() {
        return "Tên: " + name + ", Ngày sinh: " + birthday;
    }
}

class Employee extends Person {
    double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Lương: " + salary;
    }
}

class Manager extends Employee {
    Employee assistant;

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    @Override
    public String getDetails() {
        String assistantName = (assistant != null) ? assistant.name : "Không có";
        return super.getDetails() + ", Trợ lý: " + assistantName;
    }
}

public class BT4_tuan7 {
    public static void main(String[] args) {
        Employee intern = new Employee();
        intern.setName("Trịnh Gia Bảo");

        Manager quanLy = new Manager();
        quanLy.setName("Nguyễn Thị Ông Chủ");
        quanLy.setBirthday("18/09/2003");
        quanLy.setSalary(20000000.5);
        quanLy.setAssistant(intern);

        System.out.println(quanLy.getDetails());
    }
}
