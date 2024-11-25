
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr=2004;
		if((yr%4==0)&&(yr%100!=0)||(yr%400==0))
		{
			System.out.println("leapyear");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
