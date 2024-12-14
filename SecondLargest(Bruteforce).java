import java.util.*;

class SecondLargest{
	public static void main(String args []){
		int arr[]={1,9,8,4,5,6,7};
		System.out.print("second largest Element is"+SecondLargest(arr));
	}

	static int SecondLargest(int arr[]){
		Arrays.sort(arr);
		return arr[1];
		
	}
}