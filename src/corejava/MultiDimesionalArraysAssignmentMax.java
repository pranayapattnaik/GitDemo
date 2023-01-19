package corejava;

public class MultiDimesionalArraysAssignmentMax {

	public static void main(String[] args) {

		// 2 4 5
		// 3 4 7
		// 1 2 9
		// Print the maximum number
		
		int arr[][] = {{4,4,5},{3,4,7},{2,1,9}};
		int max = arr[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				 if(arr[i][j]>max)
				 {
					  max = arr[i][j];
				 }
			}
		}
		System.out.println(max);
	}

}
