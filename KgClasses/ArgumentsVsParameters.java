import java.util.Scanner;
public class ArgumentsVsParameters
{
	public static void main(String[] args)
	{
		invoke();
		int num1 = readNumber();
		int num2 = readNumber();
		int sum = sumTwoNumbers(num1,num2);
		System.out.println("Sum of numbers = "+sum);
		
	}
	public static void invoke()
	{
		System.out.println("ArgumentsVsParameters");
	}
	public static int readNumber()
	{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number = ");
			int number = input.nextInt();
			return number;
	}
	public static int sumTwoNumbers(int first, int second)
	{
		int sum = first+second;
		return sum;
	}
}