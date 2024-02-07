
import java.util.Scanner;
class AdditionOfArray2D{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j;
		int[][] arr = new int [2][2];
		int[][] Arr = new int [2][2];
		int[][] ARr = new int [2][2];
		System.out.print("Enter 1st Array's Element : ");
		for(i=0; i<2; i++){
			for(j=0; j<2; j++){		
			arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter 2nd Array's Element : ");
		for(i=0; i<2; i++){
			for(j=0; j<2; j++){		
			Arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("1st 2D Array is now matrix form:= ");
		for(i=0;i<2; i++){
			for(j=0; j<2; j++){
			System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		System.out.println("2nd 2D Array is now matrix form:= ");
		for(i=0;i<2; i++){
			for(j=0; j<2; j++){
			System.out.print(Arr[i][j]+" ");
			}System.out.println();
		}
		for(i=0; i<2; i++){
			for(j=0; j<2; j++){		
			ARr[i][j] = arr[i][j]+Arr[i][j];
			}
		}
		System.out.println("Addition of 1st and 2nd 2D Array is now matrix form:= ");
		for(i=0;i<2; i++){
			for(j=0; j<2; j++){
			System.out.print(ARr[i][j]+" ");
			}System.out.println();
		}
		
	}
}