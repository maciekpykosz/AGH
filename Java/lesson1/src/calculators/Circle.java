package calculators;

import static java.lang.Math.PI;

public class Circle extends Figure implements Print{
    private double r;

    public Circle(double r) {
        if(r<=0){  throw new IllegalArgumentException("r musi być > 0: ");}
        this.r = r;
    }

    @Override
    double calculateArea() {
        return PI* r * r;
    }

    @Override
    double calculatePerimeter() {
        return 2*PI* r;
    }

    @Override
    public void print() {
        System.out.println("Radius: " + r);
        System.out.println("Pole: " + calculateArea());
        System.out.println("Obwód: " + calculatePerimeter());
        System.out.println();
    }
}
