import java.util.*;
class Cellphone{
    void Vibration(){
        System.out.println("Your Phone is Vibrating.....");
    }
    void Ringtone(){
        System.out.println("Your Phone is Ringing....");
    }
    void Music(){
        System.out.println("Your Phone is Playing Music....");
    }
    void Camera(){
        System.out.println("Your Phone Camera is on....");
    }
}
public class CellPhone_Methods {
    public static void main(String[] args) {
        Cellphone Iphone16=new Cellphone();
        Cellphone Pixel6a=new Cellphone();


        Iphone16.Camera();
        Pixel6a.Ringtone();
        Pixel6a.Vibration();
        Iphone16.Music();
    }
}
