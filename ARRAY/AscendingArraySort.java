
public class AscendingArraySort
{
	public static void main(String[] args)
	{
		int[] arr = {8,9,7,5,4,8,2,5,4,5,1,2,5,7,3,6};
		int i,j,temp,flag;
		for(i=0; i<arr.length; i++)
		{
			flag=0;
			for(j=0; j<arr.length-1-i; j++)
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		if(flag==0)
		{
			break;
		}
		}
			for(int k: arr)
		{
			System.out.print(k+" ");
		}
	}
}