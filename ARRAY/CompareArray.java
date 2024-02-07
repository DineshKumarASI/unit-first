import java.util.Arrays;
public class CompareArray{
	public static void main(String[] args){
		int[] arr  = {5,2,3,5};
		int[] arr1 = {5,2,3,5};
		int[] arr2 = {5,2,3,1};
		int[] arr3 = {5,3,5};
		System.out.println("from ==");
		if(arr[]==arr1[]){
			System.out.println("Both are Equals:=");
		}else{
			System.out.println("Both are not Equals:=");
		}
		System.out.println("from Arrays.Equals:=");
		if(Arrays.equals(arr,arr1)){
		System.out.println("Both are Equals:=");
		}else{
			System.out.print("Both are not Equals:=");
		}
		
	}
}