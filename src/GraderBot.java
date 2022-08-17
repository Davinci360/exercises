import java.util.Scanner;

public class GraderBot {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter numerical score");


        Integer grade = intScanner.nextInt();  // Read user input
        if(grade >= 90) {System.out.println("you got an A");}
        else if(grade >= 80) {System.out.println("you got a B");}
        else if(grade >= 70) {System.out.println("you got a C");}
        else if(grade >=65) {System.out.println("you got a D");}
        else if(grade < 65) {System.out.println("you failed");}

        //System.out.println("Your grade is: " + grade);  // Output user input


    }
}
