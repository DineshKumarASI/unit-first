import java.util.Scanner;
public class PrintReverseElementArray{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("input element of array:");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();			
		}
		System.out.println("now array is: ");
		for(int P :arr){
			System.out.print(P+" ");
		}
		System.out.println();
		System.out.println("Size of array  "+arr.length);
		
		System.out.print("Reverse print given array ");
		for(int i =arr.length-1; i>=0; i--){
			System.out.println(arr[i]);
			
		}
		
	}
}