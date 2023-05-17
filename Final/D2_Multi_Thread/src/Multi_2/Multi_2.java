package Multi_2;

class MyThread extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Thread "+ i);
            try{
                sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Multi_2 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
