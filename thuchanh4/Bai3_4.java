package thuchanh4;

// 3 & 4. Interface GeometricObject, Resizable và các lớp triển khai
interface GeometricObject {
    double getPerimeter();
    double getArea();
}

interface Resizable {
    void resize(int percent);
}

class CircleBai3 implements GeometricObject {
    protected double radius = 1.0;

    public CircleBai3(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class ResizableCircle extends CircleBai3 implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }
}

public class Bai3_4 {
    public static void main(String[] args) {
        CircleBai3 c1 = new CircleBai3(5.0);
        System.out.println("Chu vi Circle: " + c1.getPerimeter());
        System.out.println("Dien tich Circle: " + c1.getArea());

        ResizableCircle rc = new ResizableCircle(10.0);
        System.out.println("Ban kinh ResizableCircle ban dau: 10.0");
        System.out.println("Dien tich truoc: " + rc.getArea());
        
        // Giam kich thuoc con 50%
        rc.resize(50); 
        System.out.println("Dien tich sau khi resize 50%: " + rc.getArea());
    }
}