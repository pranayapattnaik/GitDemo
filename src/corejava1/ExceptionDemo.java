package corejava1;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a= 7;
		int b= 0;
		try
		{
			int c= a/b;
		int arr[] = new int[5];
		
		System.out.println(c);
		
		}
		
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("IndexOutOfBounds exception");
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("Arithmetic exception");
		}

		catch(Exception e)
		{
			System.out.println("i caught the exception");
		}
		finally
		{
			//This block is executed irrespective of the exception thrown or not
			System.out.println("Delete Cookies");
			
		}
		

	}

}
