import java.util.Scanner;
public class Q5{
	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
	    System.out.print("Enter first number = ");
		int num1 = scn.nextInt();
		System.out.print("Enter first number = ");
		int num2 = scn.nextInt();
		sum(num1,num2);
	}
	
	static void sum(int num1,int num2){
		int sum = num1+num2;
		System.out.println("Sum ="+sum);
		
	}
}