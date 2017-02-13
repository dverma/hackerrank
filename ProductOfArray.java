package challenges;

public class ProductOfArray
{
	public static void main(String[] args)
	{
	  int[] arr = {1,2,3,4,5};
	  arrayWithProducts(arr);
	}
	static void arrayWithProducts(int[] arr)
	{
	  int len = arr.length;
	  int[] newArr = new int[len];

	  int product= 1;

	  for(int i=0;i<len;i++)
	  {
	    product = product * arr[i];
	  }
	  for(int i=0;i<len;i++)
	  {
	    newArr[i] = product/arr[i];
	    System.out.println(newArr[i]);
	  }

	  
	}
}
