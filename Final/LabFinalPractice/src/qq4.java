class Th1 extends Thread {
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Thread1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Th2 extends Thread {
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Thread2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class qq4 {
    public static void main(String[] args) {
        Th1 t1 = new Th1();
        Th2 t2 = new Th2();
        t1.start();
        t2.start();
    }
}
