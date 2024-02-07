/*40. Write a program to Read and print a Two Dimensional array

Sample Output

Rows = 2
Columns = 3

Enter Array Elements a[0][0] = 1
Enter Array Elements a[0][1] = 2
Enter Array Elements a[0][2] = 3
Enter Array Elements a[1][0] = 4
Enter Array Elements a[1][1] = 5
Enter Array Elements a[1][2] = 6

Display 2D Array Element
1 2 3
4 5 6
*/
import java.util.Scanner;
public class J2A
{
	public static void main(String[] args)
	{
		int i,j,rows,columns;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter of rows and columns:= ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		int[][] arr = new int [rows][columns];
		System.out.println("Enter element of two Dimension array:= ");
			for(i=0; i<arr.length; i++)
	    {
				for(j=0; j<arr[i].length; j++)
				{
					arr[i][j] = sc.nextInt();			
				}
		}
		System.out.print("Print of Entered two Dimension array:= \n");
		for(i=0; i<arr.length; i++)
	    {
				for(j=0; j<arr[i].length; j++)
				{
					System.out.print(arr[i][j]+" ");			
				}
			System.out.print("\n");	
		}
	}
}

