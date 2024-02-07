import java.util.Scanner;
public class multiplicationTable
{
		public static void main(String[] args)
	{
		geet();
		int number = input();
		table(number);
	}
	public static void geet()
	{
		System.out.print("Welcome Print table given no.");
	}
	public static int input()
	{
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = inputNum.nextInt();
		return num;
	} 
	public static void table(int num)
	{
		int i = 1;
		while(i<=10)
		{
			int num1 = i*num;
			System.out.println(num+"X"+i+"="+num1);
			i++;
		}
		
	}
	
}

