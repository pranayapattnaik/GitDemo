package myLearning;

public class SwapString {

	public static void main(String[] args) {

				String str = "Rahul"; 
				String str1 = "Raj";
			//	System.out.println(str+str1);;
				str = str+str1;// RahulRaj
				System.out.println(str1.length());
				 str1 = str.substring(0, str.length()-str1.length());//Rahul
				 System.out.println(str1.length());
				 str = str.substring(str1.length());//Raj
				
				
				System.out.println(str);
				System.out.println(str1);
				


		
	}

}
