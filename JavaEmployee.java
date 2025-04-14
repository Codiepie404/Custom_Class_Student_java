import java.util.*;
class Employee1{
    int salary;
    int getSalary(){
        return salary;
    }
    String name;
    String getName(){
        return name;
    }
    void setName(String n){
        name=n;
    }
}
public class JavaEmployee {
    public static void main(String[] args) {
        Employee1 rakib=new Employee1();
        rakib.salary=45000;
        rakib.setName("CodiePie404");
        System.out.println("My GitHub name is "+rakib.getName());
        System.out.println("My salary is "+rakib.getSalary());

    }
}
