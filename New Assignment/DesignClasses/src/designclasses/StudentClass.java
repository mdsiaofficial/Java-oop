package designclasses;

public class StudentClass {
    private String name;
    private int age;
   
    public StudentClass(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    private void Courses(int x){
        System.out.println("Taken "+x+" Courses.");
    }
    public void Exam(int date){
        System.out.println("Exam starts At Nov "+ date);
    }
    public void Assignment(String course){
        System.out.println("Remaining Assignment: "+ course);
    }
    public static void main(String[] args) {
        StudentClass st = new StudentClass("Anik", 24);
        st.displayInfo();
        st.Assignment("CSE");
        st.Exam(1);
        st.Courses(7);
    }
    
}
