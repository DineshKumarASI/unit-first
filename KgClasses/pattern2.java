import java.util.Scanner;
public class pattern2{
	int num;
	public static void main (String[] args){
		pattern2 obj = new pattern2();
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
				System.out.print("* ");	
						i++;
			}
			System.out.println();
            row++;			
			
		}
	}
}