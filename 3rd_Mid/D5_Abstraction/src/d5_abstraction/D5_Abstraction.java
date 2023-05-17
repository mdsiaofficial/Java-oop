package d5_abstraction;

public class D5_Abstraction {
    public static void main(String[] args) {
        MobileUser mu_a = new Ashiq();
        MobileUser mu_m = new Mahida();
        mu_a.SendMessage();
        mu_m.SendMessage();
    }
}
