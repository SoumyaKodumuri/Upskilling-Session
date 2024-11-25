
public class primeCode {
	public static void main(String[] args) {
		int n=5;
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				count++;
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		}
	}

}
