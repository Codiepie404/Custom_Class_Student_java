import java.util.*;
public class switchCaseJava {
    public static void main(String[] args) {
        String character;
        System.out.print("Enter any vowel: ");
        Scanner scan= new Scanner(System.in);
        character = scan.next();

        switch(character){
            case "a":
                System.out.println("You Entered Vowel!");
                break;
            case "e":
                System.out.println("You Entered Vowel!");
                break;
            case "i":
                System.out.println("You Entered Vowel!");
                break;
            case "o":
                System.out.println("You Entered Vowel!");
                break;
            case "u":
                System.out.println("You Entered Vowel!");
                break;
            default:
                System.out.println("You've Entered a Consonant!");
        }

    }
}
