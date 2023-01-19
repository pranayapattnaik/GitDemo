package corejava;

public class NestedForLoops {

	public static void main(String[] args) {
		
		//outer for loop - This block of lopp runs 4 times
		for(int i=1; i<=4; i++) 
		{
			System.out.println("Started Outer Loop");
			
			for(int j=1; j<=4;j++)// inner loop
			{
				System.out.println("Inner Loop");
			}
			System.out.println("Finished Outer Loop");
		}
		
	}

}
