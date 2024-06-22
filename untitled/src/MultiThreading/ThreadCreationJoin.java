package MultiThreading;

public class ThreadCreationJoin {
    private static  int count=0;
    public static synchronized void incrementCount(){
            count++;
    }

    public static void main(String[] args){
         Thread t = new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i=0;i<10000;i++){
                     incrementCount();
                 }
             }
         });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    incrementCount();
                }
            }
        });
        t.start();
        t1.start();
        try {
            t.join();
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);

    }
}
