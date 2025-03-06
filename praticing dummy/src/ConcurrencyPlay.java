import java.util.concurrent.*;

public class ConcurrencyPlay {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> printNumbers());
        executor.submit(() -> printNumbers());
        executor.shutdown();

        try {
            executor.awaitTermination(1,TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of the thread");
    }
    private static void printNumbers() {
        System.out.println("Number of threads: " + Runtime.getRuntime().availableProcessors());
        for(int i =  0; i < Runtime.getRuntime().availableProcessors(); i++) {
            System.out.println(i);
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
