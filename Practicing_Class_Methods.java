import java.util.*;
/*class square{
    int side;
    int area(){
        return side*side;
    }
    int perimeter(){
        return 4*side;
    }
}*/

class tommy{
    void hit(){
        System.out.println("Come on Tommy, Hit'em, Punch'em in the face...");
    }
    void run(){
        System.out.println("Run Tommy, Run for your Life....");
    }
    void fire(){
        System.out.println("Tommy, I bet'ya to shoot a bull's Eye...");
    }
}
public class Practicing_Class_Methods {
    public static void main(String[] args) {
        /*square sq=new square();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/
        tommy tm=new tommy();
        tm.hit();
        tm.run();
        tm.fire();
    }
}
