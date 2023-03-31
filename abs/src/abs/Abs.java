package abs;

abstract class MobileUser {
    abstract void SendMessage();
}
class Ashiq extends MobileUser {
    @Override
    void SendMessage(){
        System.out.println("Hello, Mahida.");
    }
}
class Mahida extends MobileUser {
    @Override
    void SendMessage(){
        System.out.println("Hi Ashiq.");
    }
}
public class Abs {
    public static void main(String[] args) {
        // TODO code application logic here
        MobileUser mu_a = new Ashiq();
        MobileUser mu_m = new Mahida();
        mu_a.SendMessage();
        mu_m.SendMessage();
    }
    
}
