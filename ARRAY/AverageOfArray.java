
public class AverageOfArray{
	public static void main(String[] args){
		
		int[] arr = {5,6,7,8,9,4};
		int sum =0;
		System.out.print("Array is :-");
		for(int P: arr){
			sum +=P;
			System.out.print(P+" ");
		}
		int average = sum/arr.length;
		System.out.print("\n Average of array: "+average);
	}
}