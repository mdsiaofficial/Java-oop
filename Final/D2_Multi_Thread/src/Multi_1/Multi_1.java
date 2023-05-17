package Multi_1;

class DemoThread extends Thread {
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Call = "+ i);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Multi_1{
    public static void main(String[] args) {
        DemoThread d=new DemoThread();
        d.start();
    }
}