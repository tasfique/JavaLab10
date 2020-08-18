//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task1

package labtask10;
import java.util.Scanner;

public class Task1 {
    
    

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter first number "); //asking for user input
        int x = read.nextInt();
        System.out.println("Please enter second number ");
        int y = read.nextInt();
        System.out.println("GCD of " + x + " and " + y + " is "+ getGCD(x,y)); //displaying gcd.
        
    }
    
    public static int getGCD(int x, int y){ //method to calculate gcd
        if (y == 0){
            return x;
        }
        return getGCD(x,x%y);
    }
    
}
