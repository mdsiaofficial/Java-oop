/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inter;
interface Area {
    void what();
}
class House {
    void what(){
        System.out.println("Here we live.");
    }
}
class Market {
    void what(){
        System.out.println("Here we do shopping.");
    }
}
class Warehouse {
    void what(){
        System.out.println("Here we store products.");
    }
}
public class Inter {
    public static void main(String[] args) {
        // TODO code application logic here
        Market s = new Market();
        House h = new House();
        Warehouse w = new Warehouse();
        h.what();
        s.what();
        w.what();
    }
    
}
