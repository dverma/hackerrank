package challenges;

public class StringReverse
{
	public static void main(String[] args)
	{
		System.out.println(reverse("a,b$c"));
	}

	static String reverse(String s)
	{
		int len = s.length();
		int left=0, right = len-1;
		char[] string = s.toCharArray();
		while(left<right)
		{
			if( !isAlphaNumeric(String.valueOf(s.charAt(left))) )
				left++;
			else if( !isAlphaNumeric(String.valueOf(s.charAt(right))) )
				right--;
			else
			{
				char temp = s.charAt(left);
				string[left] = string[right];
				string[right] = temp;
				
				left++; right--;
			}
		}
		
		return String.valueOf(string);
	}

	static boolean isAlphaNumeric(String s)
	{
		String pattern = "^[a-zA-Z0-9]*$";
		return s.matches(pattern);
	}
}
