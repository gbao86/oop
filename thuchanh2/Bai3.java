package thuchanh2;

public class Bai3 {
    public static void main(String[] args) {
        Point2D p = new Point2D(3.5f, 4.2f);
        System.out.println("Point2D: x=" + p.getX() + ", y=" + p.getY());

        Triangle t = new Triangle(10.5f, 5.0f);
        System.out.println(t.toString()); 

        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        
        System.out.println("Tong: " + f1.add(f2).toString());
        System.out.println("Tru: " + f1.sub(f2).toString());
        System.out.println("Nhan: " + f1.mul(f2).toString());
        System.out.println("Chia: " + f1.div(f2).toString());
    }
}

class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D() {} 
    public Point2D(float x, float y) { this.x = x; this.y = y; }
    public float getX() { return x; } 
    public float getY() { return y; } 
}

class Triangle {
    private float width = 0.0f;
    private float height = 0.0f;
    public Triangle() {}
    public Triangle(float width, float height) { this.width = width; this.height = height; }
    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }
    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }
    @Override
    public String toString() { 
        return "Triangle width=" + width + " height=" + height;
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {}
    public Fraction(int num, int den) {
        this.numerator = num;
        this.denominator = den;
    }
    public Fraction(Fraction f) { 
        this.numerator = f.numerator; 
        this.denominator = f.denominator;
    }

    private int findUCLN(int a, int b) {
        a = Math.abs(a); b = Math.abs(b); 
        while (b != 0) { 
            int temp = a % b; a = b; b = temp;
        }
        return a; 
    }

    public void reducer() {
        int ucln = findUCLN(numerator, denominator);
        numerator /= ucln;
        denominator /= ucln;
    }

    public Fraction add(Fraction f) { 
        int n = this.numerator * f.denominator + f.numerator * this.denominator;
        int d = this.denominator * f.denominator; 
        Fraction res = new Fraction(n, d); res.reducer(); return res; 
    }

    public Fraction sub(Fraction f) { 
        int n = this.numerator * f.denominator - f.numerator * this.denominator;
        int d = this.denominator * f.denominator; 
        Fraction res = new Fraction(n, d); res.reducer(); return res; 
    }

    public Fraction mul(Fraction f) { 
        int n = this.numerator * f.numerator;
        int d = this.denominator * f.denominator; 
        Fraction res = new Fraction(n, d); res.reducer(); return res; 
    }

    public Fraction div(Fraction f) { 
        int n = this.numerator * f.denominator;
        int d = this.denominator * f.numerator; 
        Fraction res = new Fraction(n, d); res.reducer(); return res; 
    }

    @Override
    public String toString() { 
        return "Fraction[num=" + numerator + " den=" + denominator + "]";
    }
}