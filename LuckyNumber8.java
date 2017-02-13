package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LuckyNumber8
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String number = in.next();
        int M = 1000000007;
        List<Integer> numbersList = new ArrayList<Integer>();
        // your code goes here
        
        for(int i=1;i<=n;i++)
    	{
            //subSequences(number.toCharArray(),i,0, new char[i], numbersList);
            print("",number,i,numbersList);
        }
        System.out.println(numbersList.size());
        
        
        
        /*if(n<=3){
        	for(int i=1;i<=n;i++)
        	{
                subSequences(number.toCharArray(),i,0, new char[i], numbersList);
            }
            System.out.println(numbersList.size());
        }
        else{
        	subSequences(number.toCharArray(),3,0, new char[3], numbersList);
        }*/
        
        
        
        
    }
	
	static void print(String prefix, String remaining, int k, List<Integer> numbersList) 
	{
        if (k == 0) 
        {
        	Integer number = Integer.valueOf(prefix);
        	if(number%8==0)
    		{
    			numbersList.add(number);
        		System.out.println(prefix);
    		}
            return;
        }
        if (remaining.length() == 0) return;
        print(prefix + remaining.charAt(0), remaining.substring(1), k-1, numbersList);
        print(prefix, remaining.substring(1), k, numbersList);
    }
	
    
    static void subSequences(char[] arr, int len, int startPosition, char[] result, List<Integer> numbersList){
        if (len == 0){
            System.out.println(Arrays.toString(result));
            String temp = new String(result);
            Integer number = Integer.valueOf(temp);
            if(number%8==0){
            	System.out.println("::::::::::::::::::::::::::::::"+number);
            	numbersList.add(number);
            }
            return;
        }
        for (int i = startPosition; i <= arr.length-len; i++)
        {
            result[result.length - len] = arr[i];
            subSequences(arr, len-1, i+1, result, numbersList);
        }
    }
}
