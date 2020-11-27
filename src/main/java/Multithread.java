import java.util.ArrayList;

public class Multithread {

    public static void main(String[] args) {
        ArrayList<Thread> pool = new ArrayList<>();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (long i = 0; i < 900000; i++) {
                    System.out.printf("Thread[%s] %d\n",Thread.currentThread().getName(),i);
                }
            }
        };
        for (int i = 0; i < 4; i++) {
            Thread t = new Thread(r);
            t.setName(String.valueOf(i));
            pool.add(t);
            t.start();
        }
        for (Thread t : pool){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        syntax error
        //update
        //branch1
    }
}
