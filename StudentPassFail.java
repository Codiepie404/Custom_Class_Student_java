import java.util.*;
public class StudentPassFail {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Showing Results of Rakibul Hasan");
        //String str1= scan.nextLine();
        double math, physics, chemistry, total, passMark;
        System.out.print("Enter Maths Mark: ");
        math= scan.nextDouble();
        System.out.print("Enter Physics Mark: ");
        physics= scan.nextDouble();
        System.out.print("Enter Chemistry Mark: ");
        chemistry= scan.nextDouble();
        total=chemistry+physics+math;
        System.out.println("Total marks: "+total);
        passMark=(300*0.40);
        if(total<passMark || math<33 || physics<33 || chemistry<33){
            System.out.println("You've Failled The Exam, You're an Idiot!");
        }
        else{
            System.out.println("You've Passed, Congratulations!");
        }
    }
}
