package javaapplication31;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class A {
    class B{
        
    }
    
    void    rectangle(){
            int length=10;
            int width=20;
            int area=length*width;

            System.out.println("Area of the rectangle is "+area);

        }

    void Divide(){
        int x=16;
        if(x%4==0){
             System.out.println("The number is dividable by 4");
        }
        else{
             System.out.println("The number is  not dividable by 4");
        }
    }
    void vote(){
        int age=19;
        if(age>=18){
             System.out.println("The person is Eligable for voting");
        }
        else{
              System.out.println("The person is not Eligable for voting");
        }
    }
    
    public static void main(String[] args) {
            A obj=new A();
            obj.rectangle();
            obj.Divide();
            obj.vote();
    }
}