
public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int aT[][]= new int[3][3];
		
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			aT[i][j]=a[j][i];
			System.out.print(aT[i][j]);
		}
		System.out.println();
	}
	

	}

}
