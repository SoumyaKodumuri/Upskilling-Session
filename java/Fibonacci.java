import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		     Scanner sc=new Scanner(System.in);
		      System.out.println("Enter no.of terms: ");
		      int Nterms   =sc.nextInt();
		      int n1=0, n2=1;
		      
		      for(int i=1; i<=Nterms; i++) {
		    	  System.out.print(n1+" ");
		    	  int NextTerm= n1+n2;
		    	  n1=n2;
		    	  n2=NextTerm;
		      }
	}

}
