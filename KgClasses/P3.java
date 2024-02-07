import java.util.Scanner;
public class P3{
	int num;
	public static void main (String[] args){
		P3 obj = new P3();
		obj.input();
		System.out.println("pattern is ");
		obj.pattern();
		
	}
	void input(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter row");
		this.num = scan.nextInt();
	}
	void pattern(){
		int row =0;
		while(row<num)
		{ 
			int i=row;
			while(i<num){
				System.out.print(" ");	
						i++;
			}
			int j = 0; 
			while(j<=row){
				System.out.print("*");
				j++;
			}
			System.out.println();
            row++;			
			
		}
	}
}