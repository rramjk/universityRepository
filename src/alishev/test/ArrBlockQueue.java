package alishev.test;

public class ArrBlockQueue {
/*  PRODUCE CONSUMER
    static volatile BlockingQueue bq = new ArrayBlockingQueue<Integer>(10);
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void produce(){
        Random random = new Random();
        while(true){
            try {
                bq.put(random.nextInt(100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private static void consumer(){
        Random random = new Random();
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(bq.take());
                System.out.println("Size: " + bq.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


--------------------------------------------------------------------------------- PRODUCE CONSUME WAIT NOTIFY
    public static void main(String[] args) {
        WAN wan = new WAN();
        Thread th1 = new Thread(new Runnable(){
            public void run(){
                wan.produce();
            }
        });
        Thread th2 = new Thread(new Runnable(){
            public void run(){
                wan.cunsume();
            }
        });
        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class WAN {
    private Random random = new Random();
    private Queue<Integer> q = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();
    public void produce(){
        while(true){
            synchronized(lock){
                while(q.size() == LIMIT){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                q.add(random.nextInt(100));
                lock.notify();
            }
        }
    }
    public void cunsume(){
        while(true){
            synchronized (lock){
                while(q.size() == 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Q[" + q.size() + "]" + " " + q.remove());
                lock.notify();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
 */
}
