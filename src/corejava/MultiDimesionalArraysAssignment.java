package corejava;

public class MultiDimesionalArraysAssignment {

	public static void main(String[] args) {
		//Column 1, 2, 3
		// 2 4 5 //Row 1  4 6 5
		// 3 4 7 //Row 2  3 4 7
		// 1 2 9 //Row 3  2 1 9
		// Print the maximum number from the column of the minimum number found in the matrix
		//Example - Output should be 6
		//Explanation - 1 is the minimum number found. Now find the maximum number from the column where 1 is located
		
		//Algorithm
		//Step 1 - Find out the minimum number found in the matrix
		//Step 2 - Find out the column number
		//Step 3 - Use that column number to iterate through the column for the 3 rows
		//Step 4 - Find the max number in that row - Initialize max as 0 to compare the number in that column
		
		int arr[][] = {{4,3,1},{3,4,7},{2,1,9}};
		int min = arr[0][0];
		int k = 0;
		for(int i=0;i<3;i++) // we can use arr.lenght() instead if 3 if the matrix has same number of rows and columns
		{
			for(int j=0;j<3;j++)
			{
				 if(arr[i][j]<min)
				 {
					  min = arr[i][j];
					  k = j;  
				 }
			}
		}
		System.out.println("Minimum number in the matrix - " + min);
		//System.out.println(k);
		int max = arr[0][k];
		//System.out.println(max);
	/*	for(int l=0; l<3;l++) 
		{
			if(arr[l][k]>max)
			{
				max=arr[l][k];
			}
		}*/
		int l = 0;
		while(l<3)
		{
			if(arr[l][k]>max)
			{
				max = arr[l][k];
			}
			l++;
		}
		System.out.println("Maximum number in the column of the minimum number found in the matrix - " + max);
	}

}
