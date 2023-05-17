package multi_thread;

class MyRunnable implements Runnable{
    Thread t;
    public MyRunnable(String tName){
        t = new Thread(this, tName);
        System.out.println("Child thread: "+ t);
        t.start();
    }
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Implemented_Runnable {
    public static void main(String[] args) {
        new MyRunnable("1st");
        new MyRunnable("2nd");
    }
}
