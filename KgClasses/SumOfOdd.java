import java.util.Scanner;
public class SumOfOdd
{
		public static void main(String[] args)
	{
		geetSum();
		int number = inputOdd();
		int sum = sumOdd(number);
		System.out.println("Sum of odd numbers till "+number+" \n = "+sum);
	}
	public static void geetSum()
	{
		System.out.println("Welcome Print Sum of odd numbers.");
	}
	public static int inputOdd()
	{
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = inputNum.nextInt();
		return num;
	} 
	public static int sumOdd(int num)
	{
		int i = 1;
		int sum = 0;
		while(i<=num)
		{
			 sum +=i;
			 
			i +=2;
		}
		return sum;
	}
	
}

