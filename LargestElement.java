import java.util.*;
class LargestElement{
	public static void main(String[] args) {
		 int arr1[] =  {2,5,7,3,0};
    	System.out.println("The Largest element in the array is: " + Largest(arr1));
	} 	

	static int Largest(int arr[]){
		int Largest =arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>Largest){
				Largest=arr[i];
			}
		}
		return Largest;
		// return arr[arr.length-1];  
}


