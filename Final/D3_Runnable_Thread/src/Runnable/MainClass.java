package Runnable;

class RunnableClass implements Runnable{
    Thread t;
    public RunnableClass(String name){
        t = new Thread(this, name);
        System.out.println("Thread: "+ t);
        t.start();
    }
    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(1000);
                System.out.println(t.getName()+" "+i);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        new RunnableClass("Ashiq");
        new RunnableClass("Chester");
    }
}