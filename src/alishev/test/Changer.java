package alishev.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
    start class - startChange()
 */
public class Changer {
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();

    Object lock1 = new Object();
    Object lock2 = new Object();
    Object lock3 = new Object();

    public void addToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void addToList3() {
        synchronized (lock3) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list3.add(random.nextInt(100));
        }
    }


    public void change() {
        for (int i = 0; i < 1000; i++){
            addToList1();
            addToList2();
            addToList3();
        }
    }

    public void startChange() {
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                change();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                change();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                change();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long after = System.currentTimeMillis();
        System.out.println("Time: " + (after - before) + "\nList1: " + list1.size() + "\nList2: " + list2.size() + "\nList3: " + list3.size());


    }
}