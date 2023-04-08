public class Car {
    public void Horn(){
        String horn = "Peep Peep";
        System.out.println(horn);
    }
    public static void main(String[] args){
        Nissan n = new Nissan();
        n.Horn();
        Car c = new Car();
        c.Horn();
    }
}