import java.util.Scanner;
public class KgReturn
{
	int first,second;
	public static void main(String[] args){
	geeting();
	int first = inputNum1();
	  int second= inputNum1();
	  
	  int sum = first+second;
	  System.out.println("Sum of two number "+sum);
		
	}
	public static void geeting()
	{
		System.out.println("Calculate sum of two number= ");
	}
	
	public static int inputNum1(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number=");
		int number = scan.nextInt();
		return number;	
	
	}
}