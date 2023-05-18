package Sync;

class Table {
    synchronized void PrintTable(int n){
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
    Table t;
    NewThread_1(Table t){
        this.t = t;
    }
    public void run(){
        t.PrintTable(5);
    }
}
class NewThread_2 extends Thread{
    Table t;
    NewThread_2(Table t){
        this.t = t;
    }
    public void run(){
        t.PrintTable(100);
    }
}
public class Sync_Method {
    public static void main(String[] args) {
        Table obj = new Table();
        NewThread_1 t1 = new NewThread_1(obj);
        NewThread_2 t2 = new NewThread_2(obj);
        t1.start();
        t2.start();
    }
}
