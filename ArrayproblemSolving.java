import java.util.*;
public class ArrayproblemSolving {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Create an array of 5 floats and calculate their sum
        float []number ={15.5f,45.6f,49.8f,15.9f,98.1f};
        float sum=0.0f;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        System.out.println("Total Sum: "+sum);


        //Write a program to find out whether a given integer is present in an array or not

        /*int [] number={85,96,35,48,25,95};
        System.out.print("Enter Desired Integer: ");
        int Integer=scan.nextInt();
        for(int i=0;i<number.length;i++){
            if(Integer==number[i]){
                System.out.println(Integer+" Within Reach..!");
                break;
            }
            else{
                System.out.println(Integer+" Out Of Reach...!");
            }
        }*/

        //write a java program to reverse an array
        /*int []arr={1,2,3,4,5,6,7,8,9};
        int temp=-0, l=arr.length;
        int a= Math.floorDiv(arr.length,2);
        for(int i=0;i<a;i++){
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }*/

        //Write a java program to find if a given array is sorted or not

        /*
        boolean isSorted=true;
        int[] numbers={15,36,25,1,95,75,88};
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]<numbers[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted..!");
        }
        else{
            System.out.println("Array isn't Sorted..!");
        }*/
    }
}
