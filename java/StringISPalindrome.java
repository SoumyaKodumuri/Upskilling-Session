import java.util.Scanner;

public class StringISPalindrome {

	public static void main(String[] args) {
 		
	//	String str1="madam";
		/*
		StringBuilder sb=new StringBuilder(str1);
		System.out.println(sb.reverse());
		String str2=sb.toString();
		
		if(str1.equals(str2)) {
			System.out.println("Its a PAlindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
		*/
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a String: ");
//		
//		String originalString = sc.nextLine();
		
		String originalString ="madam";
		
		String reverseString = "";
		
 
		for(int i=originalString.length()-1; i>=0; i--) {
			
			reverseString = reverseString +originalString.charAt(i);
		}
		System.out.println(reverseString);

		if(originalString.equalsIgnoreCase(reverseString)) {
			System.out.println(originalString+ " is a palindrome");
		}
		else {
			System.out.println(originalString+ " is not a palindrome");

		}
	}

}
