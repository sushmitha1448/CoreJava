package MultiThreading;

import java.util.*;
import java.util.concurrent.*;

public class FutureExample {

    public static void main (String[] args) throws InterruptedException ,ExecutionException{
        ExecutorService ec = Executors.newFixedThreadPool(10);

        Future<List<Integer>> future = ec.submit(()->{
            //delay(1);
            return Arrays.asList(1,2,3,4,5);
        });
        List<Integer> returnList = future.get();
        System.out.println(returnList);
    }
}
