package myLearning;

public class ReverseArray {

	public static void main(String[] args) {

		char[] s = {'a','b','c','d','e'};
		//System.out.println(c);
		int left = 0;
		int right = s.length-1;
		while( left < right )
		{
			char c = s[left];
			s[left] = s[right];
			s[right] = c;
			left++;
			right--;
		}
		for(int i=0;i<s.length;i++)
		{
		System.out.print(s[i]);
		}
	}

}
