import java.util.Scanner;
public class SearchElementInArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array's size: ");
		int size = sc.nextInt();
		int[] arr = new int [size];
		
		System.out.print("Enter Array's elmentes: ");
		for(int i= 0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter no. find in array: ");
         int num = sc.nextInt(); 
		int count =0;
		for(int p: arr){
			if (p == num){
				count++;				
			}
		}
		if(count>0){
		 System.out.print("Number is found in Array ");
		}else{
			System.out.print("Number is not foundnd in Array ");
		}
	}
}