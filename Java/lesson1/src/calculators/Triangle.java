package calculators;

public class Triangle extends Figure implements Print {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        if(a<=0 || b<=0 || c<=0){  throw new IllegalArgumentException("Boki muszą być > 0: ");}
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public void print() {
        System.out.println("Length of edges: " + a + ", " + b + ", " + c);
        System.out.println("Pole: " + calculateArea());
        System.out.println("Obwód: " + calculatePerimeter());
        System.out.println();
    }
}
