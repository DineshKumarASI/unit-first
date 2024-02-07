
public class SortArrayElementsAscendingOrder{
	public static void main(String[] args){
		int[] arr = {2,3,5,6,4,8,1,0};
		int elements;
		System.out.println("Given array ");
		for(int a: arr){
			System.out.print(a+" ");
		}
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					elements = arr[i];
					arr[i]=arr[j];
					arr[j] = elements;
				} 
			}
			
		}
		System.out.println("\n Ascending order of Given array ");
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
			}
	}
}