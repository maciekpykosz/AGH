import java.util.concurrent.RecursiveTask;
import com.sun.deploy.security.TrustDecider;

import java.util.Scanner;
import java.util.concurrent.*;

public class Main {

    Scanner scanner = new Scanner(System.in);
//    System.out.println("Set array size: ");
    int totalNumbers = scanner.nextInt();
    double[] numbers = new double[totalNumbers];

    int i_p = 0;
    int i_k = totalNumbers-1;

    DevideTask task = new devdeTask(numbers, i_p, i_k);
    ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(task); // invoke umożliwia oczekiwanie na wynik
    //forkJoinPool.execute(task);

    System.out.println("Max el in array: " + task.join());
}