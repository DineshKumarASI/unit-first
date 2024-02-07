// Find the minimum and maximum element in an array
class FindMinMax
{
	public static void main (String args[])
	{
		int max,i;
		int[] a = {5,8,5,6,8,4,2,5,9};
		for(i=0; i<a.length-1; i++)
		{
			
			if(a[i]<a[i+1])
			{
				a[i] = a[i+1];				
			}
					
		}
		System.out.print("max is "+a[i]);
		
	}
}