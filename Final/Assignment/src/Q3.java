// Threaded Print Statements
class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread1");
            try {
                Thread.sleep(2000); // Sleep for 2,000 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread2");
            try {
                Thread.sleep(4000); // Sleep for 4,000 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
