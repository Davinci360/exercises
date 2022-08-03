import java.util.Scanner;

public class GraderBot {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter numerical score");


        Integer grade = intScanner.nextInt();  // Read user input
        if(grade >= 65) {System.out.println("you passed");}
        else {System.out.println("you failed");}
        //System.out.println("Your grade is: " + grade);  // Output user input


    }
}
