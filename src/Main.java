public class Main {
    public static void main(String[] args) {


        HighPriority highPriority = new HighPriority();
        Thread thread = new Thread(highPriority);
        thread.setName("high priority");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        LowPriority lowPriority = new LowPriority();
        Thread lThread = new Thread(lowPriority);
        lThread.setName("min-priority");
        lThread.setPriority(Thread.MIN_PRIORITY);
        lThread.start();

        NormPriority normPriority = new NormPriority();
        Thread nThread = new Thread(normPriority);
        nThread.setName("norm priority");
        nThread.setPriority(Thread.NORM_PRIORITY);
        nThread.start();

        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
 class NormPriority implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " "+i);
        }
    }
}



 class HighPriority implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
class LowPriority implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
