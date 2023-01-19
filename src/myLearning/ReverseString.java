package myLearning;

public class ReverseString {

	public static void main(String[] args) {

		String str = "RahulShettyAcademy"; 
		 String strrev = "";
		
		
		for(int i =str.length()-1;i > 0;i--)
		{
			 strrev = strrev + str.charAt(i);
		}
		
		System.out.println(strrev);
		
	}

}
