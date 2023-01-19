
package javaBrushup;
public class ArrayForLoop {
	
	public static void main(String[] args) {
		
		//Array
		int[] arra = new int[3];
		arra[0] = 1;
		arra[1] = 3;
		arra[2] = 5;
		
		int[] arr2 = {9,8,7};
		
		String[] arrname = new String[5];
		//or
		String[] arrname1 = {"First","Secobnd","Third"};
		for (int i =0; i<arrname1.length;i++)
		{
			System.out.println(arrname1[i]);
		}
		
		//Enhanced for loop
		for (String s : arrname1)
		{
			System.out.println(s);
		}
		
	
			int myNum = 5;

			String website = "Rahul Shetty Academy";

			char letter = 'r';

			double dec = 5.99;

			boolean myCard = true;



			System.out.println(myNum+"is the value stored in the myNum variable");

			System.out.println(website);

			//Arrays -

			int[] arr = new int[5];// 5, 10

			arr[0] = 1;

			arr[1] = 2;

			arr[2]= 4;

			arr[3]= 5;

			arr[4]= 6;





			int[] arru = {1,2,4,5,6};



			System.out.println(arru[0]);















			//for loop arr.length - 5

			for(int i = 0; i< arr.length; i++) //4

			{



			System.out.println(arr[i]);

			}



			for (int i =0;i<arru.length; i++)

			{

			System.out.println(arru[i]);

			}



			String[] name = {"rahul", "shetty", "selenium"};



			for(int i =0; i<name.length;i++)

			{

			System.out.println(name[i]);

			}



			for( String s: name)

			{

			System.out.println(s);

			}



			}

	}

