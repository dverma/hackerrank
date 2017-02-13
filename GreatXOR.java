package challenges;

import java.util.Scanner;

public class GreatXOR
{
	
	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[] arr = new int[q];
        for(int a0 = 0; a0 < q; a0++)
        {
            long x = in.nextLong();
            // your code goes here
            long i = (long) ( Math.log(x) / Math.log(2));
            long ans=0L;
            if(x==Math.pow(2, i))
            	ans = (long) (Math.pow(2, i)-1);
            if(x>Math.pow(2, i)&& x<Math.pow(2, i+1))
            	ans = (long) (Math.pow(2, i+1)-x-1);
            System.out.println(ans);
        }    
    }
}
