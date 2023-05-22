class Work{
    synchronized void Working(String s){
        for(int i=0; i<10; i++) {
            System.out.println(s);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Th1 extends Thread {
    Work w;
    Th1(Work wp){
        this.w=wp;
    }
    @Override
    public void run() {
        w.Working("Ashiq");
    }
}
class Th2 extends Thread {
    Work w;
    Th2(Work wp){
        this.w=wp;
    }
    @Override
    public void run() {
        w.Working("Sumi");
    }
}
public class q5 {
    public static void main(String[] args) {
        Work wm =  new Work();
        Th1 t1 = new Th1(wm);
        Th2 t2 = new Th2(wm);
        t1.start();
        t2.start();
    }
}