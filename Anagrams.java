package challenges;


public class Anagrams
{
	public static void main(String[] args)
	{
		String sentence = "pop this tacocat seems nice at noon";
		findAnagrams(sentence);
	}

	static void findAnagrams(String s)
	{
		int len = s.length();
		for (int i = 0; i <= len; i++)
		{
			for (int j = i + 1; j <= len; j++)
			{
				String temp = s.substring(i, j);
				// System.out.println(temp);
				if (temp.length() < 3)
					continue;
				if (isAnagram(temp))
					System.out.println(temp);
			}
		}
	}

	static boolean isAnagram(String s)
	{
		int len = s.length();
		int count = 0;
		while (count < (len / 2) + 1)
		{
			if (s.charAt(count) != s.charAt(len - 1 - count))
				return false;
			count++;
		}
		return true;
	}
}
