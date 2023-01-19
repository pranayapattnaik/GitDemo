package corejava;

public class MultiDimesionalArrays {

	public static void main(String[] args) {
		// 2  4  5   - col1 -2 ,col2 - 4, col3 - 5, row1 - 2,4,5
		// 3  4  7	 - col1 -3 ,col2 - 4, col3 - 7,	row2 - 3,4,7
		//a[row][column]
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		//print Second row first column
		//System.out.println(a[1][0]);
		
		//Another way of declaring array is in the form of array literal
		//int b[][] = {{2,4,5},{3,4,7},{5,9,1}};
		//System.out.println(b[2][1]);//trying to print 9
		for(int i =0; i<2;i++)//row
		{
			for(int j=0;j<3;j++)//column
			{
			System.out.println(a[i][j]);
			}
		}
	}

}
