
import java.util.Scanner;
class MirrorMatrixOfArray2D{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		int[][] arr = new int [3][3];
		int[][] Arr = new int [3][3];
		
		System.out.print("Enter Array's Element : ");
		for(i=0; i<arr.length; i++){
			for(j=0; j<arr.length; j++){		
			arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("2D Array is now matrix form:= ");
		for(i=0;i<arr.length; i++){
			for(j=0; j<arr.length; j++){
			System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		System.out.println(" Mirror matrix := ");
		for(i=0;i<arr.length; i++){
			for(j=arr.length-1; j>=0; j--){
			System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		
	}
}