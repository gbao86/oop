package thuchanh5;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập phương tiện (car/truck): ");
        String type = sc.nextLine().trim().toLowerCase();

        Vehicle vehicle = VehicleFactory.getVehicle(type);
        if (vehicle == null) {
            System.out.println("Loại phương tiện không hợp lệ. Hãy nhập 'car' hoặc 'truck'.");
        } else {
            vehicle.move();
        }

        sc.close();
    }

    interface Vehicle {
        void move();
    }

    static class Car implements Vehicle {
        @Override
        public void move() {
            System.out.println("car is moving");
        }
    }

    static class Truck implements Vehicle {
        @Override
        public void move() {
            System.out.println("truck is moving");
        }
    }

    static class VehicleFactory {
        public static Vehicle getVehicle(String type) {
            if ("car".equals(type)) {
                return new Car();
            } else if ("truck".equals(type)) {
                return new Truck();
            } else {
                return null;
            }
        }
    }
}

