//Find a peak element which is not smaller than its neighbors
class SmallerThanItsNeighbors
{
	public static void main(String args[])
	{
		int[] a ={5,8,7,7};
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]>=a[i+1]&& a[i]>=a[i-1])		

			{
			 System.out.print(a[i]);	
			}
		}
	}
}
