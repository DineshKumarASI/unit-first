import java.util.Scanner;
public class Q9{
	public static void main (String[] args){
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter first number ");
		float num1 = scn.nextInt();
		System.out.println("Enter first number ");
		float num2= scn.nextInt();
		opr(num1,num2);
		
	}
		static void opr(float num1, float num2){
		System.out.println("sum           "+(num1+num2));
		System.out.println("Subtraction   "+(num1-num2));
		System.out.println("Product       "+(num1*num2));
		System.out.println("Division      "+(num1/num2));
		System.out.println("modulo        "+(num1%num2));
	}
		
}