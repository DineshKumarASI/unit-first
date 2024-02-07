import java.util.Scanner;
class InsertItemInArray{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size,i,loc,item;
		System.out.print("Enter array size : ");
		size = sc.nextInt();
		int[] arr = new int [size+1];
		System.out.print("Enter Array's Element : ");
		for(i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter location new element : ");
		loc = sc.nextInt();
		System.out.print("Enter new element : ");
		item = sc.nextInt();
		
		for(i=size; i>loc;i--){
			arr[i]=arr[i-1];
		}
		arr[loc]=item;
		size++;
		for(i=0;i<size; i++){
			System.out.print(arr[i]+" ");
			
		}
	}
}