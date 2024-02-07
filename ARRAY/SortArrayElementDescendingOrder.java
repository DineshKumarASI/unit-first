
public class SortArrayElementDescendingOrder{
	public static void main(String[] args){
		int[] arr = { 5,2,8,1,9,3,7,6,4,0}; // 
		// 
		int temp,i,j;
		
		for(i=0;i<arr.length; i++){ 
//arr[i=0]={9,2,5,1,8,3,7,6,4,0}  arr[i=1]={9,8,5,1,2,3,7,6,4,0}
//arr[i=2]={9,8,7,1,2,3,5,6,4,0}  arr[i=3]=	{9,8,7,6,3,2,1,5,4,0}
// arr[i=4]={9,8,7,6,5,2,1,3,4,0} arr [i=5]={}	   
			for(j=i+1; j<arr.length; j++){//
// arr[i=0] 5,9           arr[j=1,2,3,4,5,6,7,8,9]=2,5,1,8,3,7,6,4,0				  
// arr[i=1] 2,5,8         arr[j=2,3,4,5,6,7,8,9]=5,1,8,3,7,6,4,0
// arr[i=2] 5,7           arr[j=3,4,5,6,7,8,]=1,2,3,7,6,4,0
// arr[i=3] 1,2,3,5,6     arr[j=4,5,6,7,8,9] 2,1,3,5,6,4,0
// arr[i=4] 3,5			arr[j=5,6,7,8,9]=2,1,5,4,0
// arr[i=5] 2,3,4 arr[j=6,7,8,9] 1,3,4,0	

				if(arr[i]<arr[j]){
	       // 5<2f,5<8t,8<1f,8<9t,9<3f,9<7f,9<6f,9<4f,9<0f
	      // 2<5t,5<1f,5<8t,8<3f,8<7f,8<7f,8<4f,8<0f
         //5<1f,5<2f,5<3f,5<7t,7<6f,7<4f,7<0f
        //1<2t,2<3t,3<5t,5<6t,6<4f6<0f
       //3<2f,3<1f,3<5t,5<4f,5<0f
      //2<1f,2<3t,3<4t			   
				
					temp = arr[i];  
					arr[i] = arr[j];
					arr[j] = temp; 
		  //temp=5,8,=2,5,5,1,2,3,5,3,2,3	
		 //arr[i,0]=5,8,9[i,1]=5,8 [i=2]=5,7 [i=3] 2,3,5,6 [i=4] 5,3,4
		// arr[j,2,4]=5,8 [j,2,3]=2,5,5 [j=4,5,6,7] 1,2,3,5 [j=5] 3 [j=6] 2,3 
				}
				
			} 			
		}
		System.out.print(" Sort Array Element Descending Order is:");
		for(i=0;i<arr.length; i++){
		System.out.print(arr[i]+" ");	
		}
	}
}