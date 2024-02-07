import java.util.Scanner;
public class Q8{
	public static void main (String[] args){
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter first number ");
		int num1 = scn.nextInt();
		System.out.println("Enter first number ");
		int num2= scn.nextInt();
		opr(num1,num2);
		
	}
		static void opr(int num1, int num2){
		System.out.println("sum           "+(num1+num2));
		System.out.println("Subtraction   "+(num1-num2));
		System.out.println("multply       "+(num1*num2));
		System.out.println("Division      "+(num1/num2));
		System.out.println("modulo        "+(num1%num2));
	}
		
}