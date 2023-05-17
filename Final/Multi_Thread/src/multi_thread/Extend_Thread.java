package multi_thread;

class MyThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Call No = "+ i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Extend_Thread {
    public static void main(String[] ar){
        MyThread m = new MyThread();
        m.start();
    }
}
    