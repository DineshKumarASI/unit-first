public class FindSmallesttElements{
	public static void main(String[] args){
	int[] arr = {5,4,8,9,0,1,2,3,7};
	int a = arr[0];
	for(int i=0;i<arr.length; i++){
		if( a>arr[i]){
		a=arr[i];	
		}
	}
		System.out.print("Smallest elements in array: "+a);
	}
}