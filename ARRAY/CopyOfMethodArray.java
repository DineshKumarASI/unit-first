import java.util.Arrays;
public class CopyOfMethodArray{
	public static void main(String[] args){
		int[] arr = {5,6,7,8,9,2,4};
		int[] arr1=Arrays.copyOf(arr,arr.length);
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n copy array: ");
		for(int i=0; i<arr.length;i++){
			System.out.print(arr1[i]+" ");
		}			
	}
}