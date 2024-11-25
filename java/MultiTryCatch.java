
public class MultiTryCatch {

	public static void main(String[] args) {
		try {
			int []a=new int[5];
			//a[5]= 50/0;	
			
			  try {
				int[] arr=new int[10];
				System.out.println(arr[13]);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound Exception occurs");
		}
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		finally {
		System.out.println("rest of the code");
		}

	}

}
