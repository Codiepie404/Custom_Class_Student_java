import java.util.*;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper & 2 for Scissor: ");
        int playerInput= scan.nextInt();
        Random random=new Random();
        int computerInput= random.nextInt(3);
        if(playerInput == computerInput){
            System.out.println("Draw...");
        }
        else if (playerInput==0 && computerInput==1 || playerInput==1 && computerInput==2 || playerInput==2 && computerInput==0 ) {
            System.out.println("Computer Won the Match");
        }
        else{
            System.out.println("Player Won the Match..");
        }
    }
}
