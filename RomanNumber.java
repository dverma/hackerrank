package challenges;

import java.util.*;

public class RomanNumber
{
	final static Map<Character, Integer> romanNumberMap = new HashMap<Character, Integer>(){
		{
				this.put('I', 1);
				this.put('V',  5);
				this.put('X', 10);
				this.put('L', 50);
				this.put('C', 100);
				this.put('D', 500);
				this.put('M', 1000);
		}
	};

	public static void main(String[] args)
	{
		System.out.println("I=" + romanNumber("I"));
		System.out.println("III=" + romanNumber("III"));
		System.out.println("VI=" + romanNumber("VI"));
		System.out.println("XXVI=" + romanNumber("XXVI"));
		System.out.println("LC=" + romanNumber("LC"));
		System.out.println("CL=" + romanNumber("CL"));
		System.out.println("MMMMCMXCIX=" + romanNumber("MMMMCMXCIX"));
		System.out.println("LIG=" + romanNumber("LIG") + ":" + romanToInt("LIG"));
	}

	public static int romanNumber(String roman)
	{
		int result = 0;
		char[] romanChars = roman.toCharArray();
		char prevChar = '\0';
		for (Character c : romanChars)
		{
			if (!romanNumberMap.containsKey(c))
			{
				throw new IllegalArgumentException("Not a valid roman number");
			}
			result += romanNumberMap.get(c);
			if (prevChar != '\0' && romanNumberMap.get(prevChar) < romanNumberMap.get(c))
			{
				result -= romanNumberMap.get(prevChar) * 2;
			}
			prevChar = c;
		}
		return result;
	}
	
	public static int romanToInt(String s) 
	{
	    int nums[]=new int[s.length()];
	    for(int i=0;i<s.length();i++)
	    {
	        switch (s.charAt(i))
	        {
	            case 'M':
	                nums[i]=1000;
	                break;
	            case 'D':
	                nums[i]=500;
	                break;
	            case 'C':
	                nums[i]=100;
	                break;
	            case 'L':
	                nums[i]=50;
	                break;
	            case 'X' :
	                nums[i]=10;
	                break;
	            case 'V':
	                nums[i]=5;
	                break;
	            case 'I':
	                nums[i]=1;
	                break;
	        }
	    }
	    int sum=0;
	    for(int i=0;i<nums.length-1;i++)
	    {
	        if(nums[i]<nums[i+1])
	            sum-=nums[i];
	        else
	            sum+=nums[i];
	    }
	    return sum+nums[nums.length-1];
	}
}
