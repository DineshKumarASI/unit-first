import java.util.Arrays;
public class EqualMethodOfArray{
	public static void main (String[] args){
		int[] arr  = {0,5,1,3,7,9,5,7};
		int[] arr1 = {0,5,1,3,7,9,5,7};
		int[] arr2 = {0,5,1,3,7,9,4,7};
		int[] arr3 = {0,5,1,3,7,9,5};
		boolean a   = Arrays.equals(arr,arr1);
		boolean b   = Arrays.equals(arr,arr2);
		boolean c   = Arrays.equals(arr,arr3);
		System.out.println("kya Dono Array Equal Hai:"+a);
		System.out.println("kya Dono Array Equal Hai:"+b);
		System.out.println("kya Dono Array Equal Hai:"+c);
	}
}