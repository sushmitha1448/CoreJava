package MultiThreading;

public class ThreadCreation1 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getId());
            System.out.println(i);
        }
    }
}
