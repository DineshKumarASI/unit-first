import java.util.Scanner;
class CopyArray{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter size of array ");
	int size = sc.nextInt();
	int[] arr1= new int [size];
	System.out.println("Enter array's elements: ");
	    for(int i=0; i<size;i++){
			arr1[i] = sc.nextInt();
		}
		System.out.print("Entered array is: ");
		for( int P : arr1){
			System.out.print(P+" ");
		}
		System.out.print("Copied array is :");
		int[] copyArray = new int[size];
		for(int i=0; i<size; i++){
			copyArray[i] = arr1[i];			
		}
		for(int p:copyArray){
			System.out.print(p+" ");			
		}
	}

}