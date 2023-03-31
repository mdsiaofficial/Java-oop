/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d5_abstraction;

public class D5_Abstraction {
    public static void main(String[] args) {
        // TODO code application logic here
        MobileUser mu_a = new Ashiq();
        MobileUser mu_m = new Mahida();
        mu_a.SendMessage();
        mu_m.SendMessage();
    }
}
