import java.util.Scanner;
public class SumOfDigits
{
	public static void main(String[] args)
	{
		greeting();
		int number = inputCommon();
		int sumOfDigit = sumOfDigites(number);
		
	}
	static void greeting()
	{
		System.out.println(" Welcome to Sum of Digits \n ");
	}
	static int sumOfDigites(int num)
	{
		int i =1;
		int sumOfdigites = 0;
		int num1=num;
		int sum=0;
		while(0<=num1)
		{
			sum +=(num1%10);
			num1 +=num1/10;
		}
		return sum;
			
	}
	
	
}