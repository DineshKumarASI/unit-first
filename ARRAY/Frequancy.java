public class Frequancy{
	public static void main(String[] args){
		int[] a = {5,3,5,8,6,5,3,8};
		int i,j,z;
		for(i = 0; i<a.length; i++)
		{     z=1;
			for(j = i+1; j<a.length; j++)
				
			{
				if(a[i] == a[j])
				{
					z++;					
				}
			}
			if(z>1)
			{
			System.out.print(a[i]+" = "+z);
			z=0;
			}System.out.println();
		}
	}
}