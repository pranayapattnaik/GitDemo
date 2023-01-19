package myLearning;

public class LongestConsecutiveOccurrence31 {

	public static void main(String[] args) {

		int arr[] = {4,3,25,6,7,8,9,2,3,10,2,3};
		//first we need to iterate through all these integers
		//we need to check whether next integer in the array is consecutive one
		//if its consecutive we need to get the count of how many integers are in consecutive
		
		int count = 0;
		int max=0;
		for(int i=0; i<arr.length; i++)//4
		{
			for(int j=i+1;j<arr.length;	j++)
			{
				if(arr[j] == arr[i]+1)
				{
					count++;
				}
				else {
					break;
				}

			}
			
			max= Math.max(max, count+1);
		}
		System.out.println(max);
	}

}
