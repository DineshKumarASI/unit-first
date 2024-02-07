import java.util.Arrays;
public class SortMethodOfArray{
	public static void main (String[] args){
		int[] arr = {0,5,1,3,7,9,5,7,};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}