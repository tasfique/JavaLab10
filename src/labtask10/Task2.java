//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task2

package labtask10;
import java.*;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
   public static void main (String[]args) throws IOException{
       String FileName;
       Scanner read = new Scanner(System.in); //scanner class
       int[] integers = new int [20]; //array of 20 integers
       int i = 0;
       int sum = 0;
       boolean error = true; //for do while loop
      do{
       try{
           System.out.print("Input File Name: "); //asking user to input txt file name.
           FileName = read.nextLine().trim();
           File input = new File( FileName );      
           Scanner scan = new Scanner( input );  
           Scanner scanner = new Scanner(new File(FileName));
           while(scanner.hasNextInt()){
           integers[i] = scanner.nextInt();
           
               sum += integers[i];
            System.out.println(integers[i]);
           
}
            System.out.println("sum is "+sum); //sum of all the integers.
        error=false;   
       }
       
       catch(FileNotFoundException e){ //exception for file not found.
           System.out.println("File does Not Exist Please Try Again: ");
       }
       catch(InputMismatchException exception){
            System.out.println("Integers only, please.");
            read.nextLine();
       }
      }while (error);
       
       
   }
    
    
}
   
  
