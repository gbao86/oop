package thuchanh3;

// Bài 4: Xây dựng chương trình theo thiết kế đa cấp Shape 
class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}

class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getArea() { return width * length; }
    public double getPerimeter() { return 2 * (width + length); }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}

class Square extends Rectangle {
    public Square() {}
    public Square(double side) {
        super(side, side); 
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return getWidth(); }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) { setSide(side); } 
    @Override
    public void setLength(double side) { setSide(side); }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Square sq = new Square(5.0, "yellow", false);
        System.out.println(sq.toString());
    }
}