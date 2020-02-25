package calculators;

import java.util.Scanner;

public class FiguresCalculator {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        int licznik = 0;

        while (true){
            if (licznik==4) {
                System.out.println("Koniec zabawy!");
                return;
            }
            System.out.println("KALKULATOR FIGUR");
            System.out.println("----------------");
            System.out.println("1. Koło");
            System.out.println("2. Kwadrat");
            System.out.println("3. Trójkąt");
            System.out.println("4. Wyjście");
            System.out.println();
            System.out.println("Wybierz figurę (podaj numer)");
            int answer = scanner.nextInt();


            switch (answer){
                case 1:
                    System.out.println("Podaj promień koła");
                    try {
                        Circle circle = new Circle(scanner.nextDouble());
                        circle.print();
                    }
                    catch (Exception e){
                        System.err.println(e.getMessage());
                    }
                break;

                case 2:
                    System.out.println("Podaj długość boku kwadratu");
                    try {
                        Square square = new Square(scanner.nextDouble());
                        square.print();
                    }
                    catch (Exception e){
                        System.err.println(e.getMessage());
                    }
                break;

                case 3:
                    System.out.println("Podaj długości boków trójkąta");
                    try {
                        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                        triangle.print();
                    }
                    catch (Exception e){
                        System.err.println(e.getMessage());
                    }
                break;

                case 4: return;
                default:
                    licznik++;
                    System.out.println("Niepoprawny numer! " + licznik + " próba z 3 możliwych!");
                    break;
            }
        }
    }
}
