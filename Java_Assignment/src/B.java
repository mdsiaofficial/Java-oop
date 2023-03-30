class B extends A_ {
    int x = 20;

    void display() {
        System.out.println("Value of x in class A: " + super.x);
        System.out.println("Value of x in class B: " + x);
    }
}