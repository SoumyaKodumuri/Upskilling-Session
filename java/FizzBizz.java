
public class FizzBizz {
	public static void main(String[] args) {
		int a=19;
		if((a%3==0)&&(a%5==0))
		{
		System.out.println("the number is a FIZZBUZZ");	
		}
		else if(a%5==0)
		{
			System.out.println("the number is BUZZ");
			
		}
		else if(a%3==0)
		{
			System.out.println("the number is FIZZ");
		}
		else {
			System.out.println(a);
		}
	}

}
