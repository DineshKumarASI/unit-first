import java.util.Scanner;
public class Q7{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter first number ");
		int num1 = scn.nextInt();
		System.out.print("Enter second number ");
		int num2 = scn.nextInt();
		swap(num1, num2);
	}
	 static void swap(int num1, int num2){
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.print("swap \n " +num1+" \n "+num2);
	}
}