
import java.util.Scanner;
class Array2DMatrixForm{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j;
		int[][] arr = new int [2][2];
		System.out.print("Enter Array's Element : ");
		for(i=0; i<2; i++){
			for(j=0; j<2; j++){		
			arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("2D Array is now matrix form:= ");
		for(i=0;i<2; i++){
			for(j=0; j<2; j++){
			System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		
	}
}