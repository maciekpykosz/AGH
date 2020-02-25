import java.util.concurrent.RecursiveTask;

class DivideTask extends RecursiveTask<int[]> {

    int[] arrayToDivide;
    private int start;
    private int  stop;
    private int[] scal_tab;

    public DivideTask(int[] arrayToDivide, int start, int stop) {
        this.start = start;
        this.stop = stop;
        this.arrayToDivide = arrayToDivide;
    }

    protected int[] compute() {

        int mid = (start + stop)/2;

        DivideTask task1 = new DivideTask(arrayToDivide, start, mid-1);
        DivideTask task2 = new DivideTask(arrayToDivide, mid, stop);

        task1.fork();
        task2.fork();

        int[] tab1 = task1.join();
        int[] tab2 = task2.join();

        scal_tab(tab1, tab2, scal_tab);

    }

    private void scal_tab(
            int[] tab1,
            int[] tab2,
            int[] scal_tab) {

        int i = 0, j = 0, k = 0;

        while ((i < tab1.length) && (j < tab2.length)) {

            if (tab1[i] < tab2[j]) {
                scal_tab[k] = tab1[i++];
            } else {
                scal_tab[k] = tab2[j++];
            }

            k++;
        }

        if (i == tab1.length) {

            for (int a = j; a < tab2.length; a++) {
                scal_tab[k++] = tab2[a];
            }

        } else {

            for (int a = i; a < tab1.length; a++) {
                scal_tab[k++] = tab1[a];
            }

        }
    }

}