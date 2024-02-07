import java.util.Scanner;

public class pattern1 {
	    int num;
	public static void main(String[] args) {
		pattern1 obj = new pattern1();
		obj.print();
		obj.input();
		System.out.println("pattern is ");
   		obj.pattern();		
	}
	
	void input (){
		Scanner scan = new Scanner(System.in);
	    System.out.println(" Enter row of pattern = ");
	    this.num = scan.nextInt();
	}
	void pattern()	{
		
	 int row =0;
	    while(row<num) {
    	 int i= 0;
     	 while(i<=row) {
     		 System.out.print("* ");
     		 i++; 
     	 }
		 System.out.println();
     	 
     	 row++;
     	 } 
     }
	 void print ()
	 {
		System.out.println(num); 
	 }
}
