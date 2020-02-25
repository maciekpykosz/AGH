import  java.util.Random;


class Obraz {

    private int size_n;
    private int size_m;
    private char[][] tab;
    private int[] histogram;
    private String[] histo_string;

    public Obraz(int n, int m) {

        this.size_n = n;
        this.size_m = m;
        tab = new char[n][m];

        final Random random = new Random();

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                tab[i][j] = (char)(random.nextInt(94)+33);  // ascii 33-127
                System.out.print(tab[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        histogram = new int[94];
        clear_histogram();

    }

    public void clear_histogram(){

        for(int i=0;i<94;i++) histogram[i]=0;

    }

    public void calculate_histogram(int number_thr){

        for(int i=0;i<size_n;i++) {
            for(int j=0;j<size_m;j++) {
                if (tab[i][j] == (char) (number_thr + 33)) histogram[number_thr]++;
            }
        }
    }

    public synchronized void print_histogram(int number_thr){

        System.out.print("Watek " + number_thr + ": " + (char)(number_thr+33)
                + " " + histogram[number_thr] + " ");
        for(int i=0;i<histogram[number_thr];i++){
            System.out.print("=");
        }
        System.out.println();
    }

}
