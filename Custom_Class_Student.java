import java.util.*;

class Student{
    int id;
    String name;
    String semester;
    double cgpa;
    void printDetails(){
        System.out.println("My Name is: "+name);
        System.out.println("My Id is: "+id);
        System.out.println("I'm currently in "+semester+" semester.");
        System.out.println("My Cgpa is: "+cgpa);
    }
}
public class Custom_Class_Student {
    public static void main(String[] args) {
        System.out.println("This is a Students Academic Details");
        Student Rakib=new Student();
        Student Hadi=new Student();
        Student Tohura=new Student();
        Rakib.id=2024360674;
        Rakib.name="Md. Rakibul Hasan";
        Rakib.semester="Spring-25";
        Rakib.cgpa=3.28;
        Hadi.id=2024360675;
        Hadi.name="Abdul Hadi";
        Hadi.semester="Fall-25";
        Hadi.cgpa=3.67;
        Tohura.id=2024360676;
        Tohura.name="Tohura Akhter";
        Tohura.semester="Fall-24";
        Tohura.cgpa=4.00;

        Rakib.printDetails();
        Hadi.printDetails();
        Tohura.printDetails();
    }
}
