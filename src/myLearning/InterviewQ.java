package myLearning;

public class InterviewQ {

	public static void main(String[] args) {
	
		String str = "Java,Selenium,TestNG,Maven";
		String[] str1 = str.split(","); //it is split the string into single elements and store it in array as split return type is array

		for(int i =0; i<= str1.length-1; i++)
		{
			System.out.println(str1[i]);
		}
		
		String s= "ABC";
		String s1= "XYZ";
		String s3 = "PQR";
		//String concans= s+s1+s3;
		String sconcan = s.concat(s1).concat(s3);
		System.out.println(sconcan);
		
		
	}

}
