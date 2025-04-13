import java.util.*;
class Employee{
    int id;
    String name;
    int salary;

     void printDetails() {
        System.out.println("My id is "+id);
         //System.out.println("My Salary is "+salary);
        System.out.println("My name is "+name);
    }

     int getSalary(){
         return salary;
    }
}
public class Custom_ClassInJava {
    public static void main(String[] args) {
        System.out.println("This is a custom class practice session");
        Employee rakib=new Employee(); //Instantiating a new Employee Object
        Employee hadi=new Employee();
        // Setting Atributes for rakib
        rakib.name="Rakibul Hasan";
        rakib.id=2024360674;
        rakib.salary=45000;

        //Setting Attributes for Hadi
        hadi.name="Abdul Hadi";
        hadi.id=2024360675;
        hadi.salary=50000;

        //printing Atributes
        //System.out.println(Rakib.id);
        //System.out.println(Rakib.name);
        rakib.printDetails();
        hadi.printDetails();
        int salary=rakib.getSalary();
        int salaryy=hadi.getSalary();
        //int salary=hadi.getSalary;
        System.out.println("Salary of Rakib is "+ salary);
        System.out.println("Salary of Hadi is "+ salaryy);
    }
}
