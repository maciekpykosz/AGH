public class Watek extends Thread {
    @Override
    public void run(){}

    public Watek(int number_thr, Obraz obraz) {
        obraz.calculate_histogram(number_thr);
        obraz.print_histogram(number_thr);
    }
}
