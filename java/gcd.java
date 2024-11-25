
public class gcd {

	public static void main(String[] args) 
	{
     /* int a=12, b=28;
      
      while(b!=0) {
    	  int temp=b;
    	  b=a%b;
    	  a=temp;  
      }
      System.out.println("gcd of a and b :" +a);
	}
	*/
		
		int n1=24,n2=28;
		while(n1!=n2)
		{
			if(n1>n2)
			{
				n1=n1-n2;
			}
			else
			{
				n2=n2-n1;
			}
		}
		
       System.out.println("gcd of two numbers is :" +n2);
	}
}
