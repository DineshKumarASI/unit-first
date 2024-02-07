import java.util.Scanner;
class DeleteItemInArray{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size,i,loc,item;
		System.out.print("Enter array size : ");
		size = sc.nextInt();
		int[] arr = new int [size];
		System.out.print("Enter Array's Element : ");
		for(i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Array is now:= ");
		for(i=0;i<size; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n Enter location delete element : ");
		loc = sc.nextInt();
		
		for(i=loc; i<size-1;i++){
			arr[i]=arr[i+1];
		}
		size--;
		System.out.print("After array is deleting item: ");
		for(i=0;i<size; i++){
			System.out.print(arr[i]+" ");
			
		}
	}
}