package alishev.test;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int[] mass1 = new int[10];
        List<Integer> mass2 = new ArrayList<>();

        fill(mass1);
        fill(mass2);

        mass1 = Arrays.stream(mass1).map(a -> {
            if(a % 2 == 0)
            return a*=2;
            else return a;
        }).toArray();
        System.out.println(Arrays.toString(mass1));
    }

    public static void fill(List<Integer> mass){
        for(int i = 1; i <= 10; i++){
            mass.add(i);
        }
    }

    public static void fill(int[] mass){
        for(int i = 1; i <= 10; i++){
            mass[i-1] = i;
        }
    }
}






