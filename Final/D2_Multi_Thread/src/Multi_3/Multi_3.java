package Multi_3;

class NewThread extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("New Thread "+ i);
        }
        try{
            sleep(40000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Multi_3 {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();
    }
}
