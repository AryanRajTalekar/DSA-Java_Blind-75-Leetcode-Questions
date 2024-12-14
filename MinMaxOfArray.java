// import java.util.*;
// import java.util.Arrays;


// class MinMaxOfArray{

// 	static void minMax(int[] arr){
// 		Arrays.sort(arr);
// 		int n = arr.length;
// 		int minimum = arr[0];
// 		int maximum = arr[n-1];

// 			System.out.println("Minimum element is:"+minimum);
// 			System.out.println("Maximum element is:"+maximum);
// 	}

// 	public static void main(String args[]){
// 		int[] arr = {22,14,8,17,35,3};


// 		minMax(arr);
		
// 	}
// }


import java.util.*;
import java.util.Arrays;

class MinMaxOfArray{
	static  void Max(int[] arr){
		int n=arr.length;
		int max= arr[0];
		for(int i=0;i<n;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}

	static  void Min(int[] arr){
		int n=arr.length;
		int min= arr[0];
		for(int i=0;i<n;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		
		System.out.println(min);
	}

	public static void main(String args[]){
	int[] arr = {22,14,8,17,35,3};


 	Max(arr);
 	Min(arr);
		
 	}
}