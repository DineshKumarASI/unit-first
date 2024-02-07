
public class CopyArrayP{
	public static void main(String[] args){
		int[] a = {5,3,5,8,6,5,3,8};
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++){
			b[i] = a[i];
		} System.out.print("Orignal Array is: = ");
		for(int num:a){
			System.out.print(num+" ");
		}
		System.out.print("Copied Array is: = \n");
		for(int num:b){
			System.out.print(num+" ");
		}
		System.out.print("frequency count: = \n");
		
		System.out.print("array size:="+a.length);
		int z=0;
		for(int i = 0; i<a.length; i++)
		{
			
			for(int k = i+1; k<a.length; k++);
			{
				if(a[i] == a[k])
				{
					z++;					
				}
			}
			if(z>0)
			{
			System.out.print(a[i]+" = "+z);
			z=0;
			}
		}
	}
}