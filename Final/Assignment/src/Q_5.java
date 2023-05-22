// SynchronizationExample
class New {
    void Print(int n){
        for(int i=0; i<=5; i++){
            System.out.println(n*i+" ");
            try{
                Thread.sleep(400);
                //sleep(400);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class NewThread_1 extends Thread{
    New t;
    NewThread_1(New t){
        this.t = t;
    }
    public void run(){
        synchronized (t){
            t.Print(5);
        }
    }
}
class NewThread_2 extends Thread{
    New t;
    NewThread_2(New t){
        this.t = t;
    }
    public void run(){
        synchronized (t){
            t.Print(100);
        }
    }
}
public class Q_5 {
    public static void main(String[] args) {
        New obj = new New();
        NewThread_1 t1 = new NewThread_1(obj);
        NewThread_2 t2 = new NewThread_2(obj);
        t1.start();
        t2.start();
    }
}
