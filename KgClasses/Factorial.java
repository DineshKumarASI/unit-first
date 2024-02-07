import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		geeting();
		int number = inputCommon();
		long factorials = CalculateFactorial(number);
		System.out.println("Factorial of " +number+" \n = "+ factorials);
	}
	static void geeting()
	{
		System.out.println("Calculate Factorial of given number ");
	}
	static int inputCommon()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = scanner.nextInt();
		return num;
	}
	static long CalculateFactorial(int num)
	{
		int i = 2;
		long fact = 1;
		while(i<=num)
		{
			if (num<2)
			{
				return 1;
			}
			fact *=i;
			i++;
		}
		return fact;
	}
	
}