import java.util.*;

public class RecursionInJava {
 /* finding factorial using normal function
    static int factorial(int n){
         int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Desired Number: ");
        int num=scan.nextInt();
        System.out.print("Factorial Result: "+factorial(num));
    }
    */

    // finding factorial using recursion
    static int factorial(int n){
        int fact=1;
        if(n==0 || n==1){
            return 1;
        }
        else {
             fact = n * factorial(n - 1);
        }
        return fact;
    }
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter Your Desired Number: ");
     int num=scan.nextInt();
     System.out.println("Factorial Result: "+factorial(num));
 }
}


