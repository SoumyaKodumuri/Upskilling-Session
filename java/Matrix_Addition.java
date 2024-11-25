
public class Matrix_Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a[][]= {{1,2,3},{1,2,3},{2,3,4}};
		 int b[][]= {{3,4,5},{4,5,6},{1,2,3}};
		 
		 int c[][]= new int[3][3];
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				// c[i][j]=a[i][j] + b[i][j];  //addition
				// c[i][j]=a[i][j] - b[i][j];    // subtraction
				 c[i][j]=a[i][j] * b[i][j];   //multiplication
				 System.out.print(c[i][j] + " ");
			 }
			 System.out.println();
		 }
	}

}
