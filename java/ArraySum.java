import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   int [] array =new int[] {1, 7, 3, 2, 88};
   int sum = 0;
   for(int i=0; i<array.length; i++)
   {
	   sum = sum + array[i];
   }
   System.out.println(sum);               //sum
   System.out.println(sum/array.length);  //Average
   
   Arrays.sort(array);                    //sort
  System.out.println(Arrays.toString(array));
 
  int min=array[0];
  int max=array[(array.length) -1];
  System.out.println("min:" + min);
  System.out.println("max:" + max);
  System.out.println(max - min);
  
  
  int [] arr2=new int[] {2,3,8,0,6};
  
  System.out.println(array.length);
  System.out.println(arr2.length);
 
  int res=array.length + arr2.length;
  int [] result =  new int[res];
  
  System.out.println(arr2.equals(array));  //Arrays areEqual
  System.out.println(array[4]);
 
  ///
  double [] average= new double[20];
  System.out.println(average[19]=15.25);
  
	}

}
