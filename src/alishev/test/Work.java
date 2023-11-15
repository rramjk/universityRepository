package alishev.test;
/*
        ExecutorService ES = Executors.newFixedThreadPool(2);
        for(int i = 1; i <= 5; i++){
            ES.submit(new Work(i));
        }
        ES.shutdown();

        try {
            ES.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
 */
public class Work implements Runnable{
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work id_" + id + " was comlited");
    }
}
