package corejava;

public class MultiDimesionalArraysAssignmentMin {

	public static void main(String[] args) {

		// 2 4 5
		// 3 4 7
		// 1 2 9
		// Print the minimum number
		
		int arr[][] = {{4,4,5},{3,4,7},{2,1,9}};
		int min = arr[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				 if(arr[i][j]<min)
				 {
					  min = arr[i][j];
				 }
			}
		}
		System.out.println(min);
	}

}
