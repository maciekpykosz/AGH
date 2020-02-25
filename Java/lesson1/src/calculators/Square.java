package calculators;

public class Square extends Figure implements Print{
    double a;

    public Square(double a) {
        if(a<=0){  throw new IllegalArgumentException("a musi być > 0: ");}
        this.a = a;
    }

    @Override
    double calculateArea() {
        return a*a;
    }

    @Override
    double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public void print() {
        System.out.println("Length of edge: " + a);
        System.out.println("Pole: " + calculateArea());
        System.out.println("Obwód: " + calculatePerimeter());
        System.out.println();
    }
}
