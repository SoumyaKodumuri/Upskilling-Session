import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number = sc.nextInt();
		
		int originalNumber = number;
		
		int reverseNumber =0;
		
		while(number!=0) {
			
			reverseNumber = reverseNumber*10 + number%10;
			number = number/10;
		}
 
		//System.out.println(reverseNumber);
		if(originalNumber == reverseNumber) {
			System.out.println(originalNumber + " is a Palindrome number");
		}
		else {
			System.out.println(originalNumber + " is not a Palindrome number");
		}
	}

}
