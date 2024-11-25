
public class prime_composite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int n=11;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Its a Prime");
		}
		else
		{
			System.out.println("Its a Composite");
		}

	}

}
