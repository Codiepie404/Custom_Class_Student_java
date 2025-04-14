import java.util.*;
class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        MyEmployee rakib=new MyEmployee();
        //rakib.id= 2024360674;
        //rakib.name="CodiePie404"; --> Throws an error due to private access modifier
        rakib.setName("CodiePie404");
        rakib.setId(2024360674);
        System.out.println(rakib.getname());
        System.out.println(rakib.getId());
    }
}
