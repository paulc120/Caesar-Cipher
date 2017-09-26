/*
 
 Paul Choh
 CS 120: Computer Programming I 
 Fall 2017
 Cipher.java

*/

package assignment1;
import java.util.Scanner; 

public class Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please enter five numbers between 0 and 19. ");
		
		int numberOne, numberTwo, numberThree, numberFour, numberFive;
	 	
		// get five digits
		System.out.print("\nFirst number: ");
		numberOne = scan.nextInt();
		
		System.out.print("Second number: ");
		numberTwo = scan.nextInt();
		
		System.out.print("Third number: ");
		numberThree = scan.nextInt();
		
		System.out.print("Fourth number: ");
		numberFour = scan.nextInt();
		
		System.out.print("Fifth number: ");
		numberFive = scan.nextInt(); 
		
		
		// get sum of five numbers
		System.out.println("\nYour sum is: " + (numberOne + numberTwo + 
						numberThree + numberFour + numberFive) + ".");
		 
		// store sum of five numbers in variable
		int total; 
		total = numberOne + numberTwo + numberThree + numberFour + numberFive; 
		
		// separate individual numbers
		int onesPlace, tensPlace; 
		onesPlace = total / 10; 
		tensPlace = total % 10; 
		
		// get key
		System.out.print("\nEnter a number between 0 to 9 for encoding: ");
		
		// store key to a variable
		int key; 
		key = scan.nextInt(); 
		
		// set formula for encryption
		int formulaOnesPlace, formulaTensPlace; 
		formulaOnesPlace = (onesPlace + key) % 10;
		formulaTensPlace = (tensPlace + key) % 10; 
		
		// display the encoded numbers
		System.out.println("\nYour encoded numbers are: " + formulaOnesPlace + formulaTensPlace);
	}
	

}
