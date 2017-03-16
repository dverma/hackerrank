/*
a. 
6 3 
10 15 
12 17 
16 18 
18 13 
30 10 
32 1

b. 
6 4 
10 15 
12 17 
16 18 
18 13 
30 10 
32 1

c. 
6 5 
10 15 
12 17 
16 18 
18 13 
30 10 
32 1

d. 
6 1 
10 15 
12 17 
16 18 
18 13 
30 10 
32 1

62 28 2 468
For 4 Stacks: 10 15 | 12 17 | 16 18, 18 13 | 30 10, 32 1
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Poles {

	static Map<Integer, List<Long>> polesWeightMap = new HashMap<Integer, List<Long>>();
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // No of poles
        int k = in.nextInt(); // No of Stacks
        
        int[] altitudes = new int[n];
        int[] weights = new int[n];
        for(int a0 = 0; a0 < n; a0++)
        {
            int x_i = in.nextInt();
            int w_i = in.nextInt();            
            altitudes[a0] = x_i;
            weights[a0] = w_i;
        }
        
        for(int i=0;i<n;i++)
        {
        	List<Long> costs = new ArrayList<Long>();
        	for(int j=n-1;j>i;j--)
        	{
        		long cost = (altitudes[j]-altitudes[i])*weights[j];
        		costs.add(cost);
        	}
        	polesWeightMap.put(altitudes[i], costs);
        }
        
        
        System.out.println(polesWeightMap);
    }
    
    public static Long minCost(int[] altitudes, int k)
    {
    	Long cost = 0L;
    	if(k==1)
    	{
    		for(Long l : polesWeightMap.get(altitudes[0]))
    			cost+=l;
    	}
    	return cost;
    }
    
}


