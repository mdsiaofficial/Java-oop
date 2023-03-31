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
        Market s = new Market();
        House h = new House();
        Warehouse w = new Warehouse();
        Area a = new Area();

        
        h.what();
        s.what();
        w.what();
    }
    
}
