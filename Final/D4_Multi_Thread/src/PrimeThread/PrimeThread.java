package PrimeThread;


class Prime{
    void CheckPrime(int n){
        int c=0;
        for(int i=1; i<n/2; i++){
            if(n%i==0) c++;
        }
        if(c==2) System.out.println("Prime");
        else System.out.println("No Prime");
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    void DisplayPrime(int n){
        int c=0;
        for(int i=1; i<n; i++){
            for(int j=1; j<n/2; j++){
                if(i%j==0) c++;
            }
            if(c==2) System.out.println(i);
        }
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class MyThread_1 extends Thread{
    Prime p;
    MyThread_1(Prime p){
        this.p = p;
    }
    @Override
    public void run(){
        p.CheckPrime(69);
    }
}
class MyThread_2 extends Thread{
    Prime p;
    MyThread_2(Prime p){
        this.p = p;
    }
    @Override
    public void run(){
        p.DisplayPrime(50);
    }
}
public class PrimeThread {
    public static void main(String[] args) {
        Prime obj =  new Prime();
        MyThread_1 mt1 = new MyThread_1(obj);
        MyThread_2 mt2 = new MyThread_2(obj);
        mt1.start();
        mt2.start();
    }
}
