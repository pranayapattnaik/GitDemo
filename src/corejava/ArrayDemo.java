package corejava;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[] = new int[5];// Declares an array and allocates memory for the values
		a[0]= 2;
		a[1]= 4;
		a[2]= 6;
		a[3]= 11;
		a[4]= 15;// initialized values in that array
		
		//Another way of declaring array is in the form of array literal
		
		int b[] = {2, 9, 13, 34, 78};
		//System.out.println(b);// output - [I@76ed5528
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Change by GitDemo");
			System.out.println("Change by GitDemo");
			//System.out.println(b[i]);// retrieve the values from that array
		}
		
	}

}
