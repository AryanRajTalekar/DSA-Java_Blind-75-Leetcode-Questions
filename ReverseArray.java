import java.util.Arrays;


// using temporary arrayaoach ......brute force
// class ReverseArray{

// 	static void reverseArray(int[] arr){
// 	 int n = arr.length;

// 	 int[] temp = new int[n];

// 	 for(int i = 0;i<n;i++){
// 	 	temp[i] = arr[n-i-1];
// 	 }

// 	 for(int i = 0;i<n;i++){
// 	 	arr[i] = temp[i];
// 	 }
// }

// public static void main(String args[]){
// 	int[] arr = {1,4,3,2,6,5};
// 	 int n = arr.length;

// 	reverseArray(arr);

// 	for(int i=0;i<n;i++){
// 		System.out.print(arr[i]+" ");
// 	}
// }

// }


// Using Two pointer approach


class ReverseArray{

	static void reverseArray(int[] arr){
		int n = arr.length;
		int left =0;
		int right = n-1;

		while(left<right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}
	}

	public static void main(String args[]){
		int[] arr = {1,4,2,3,6,5};

		int n = arr.length;

		reverseArray(arr);

		for(int i= 0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}




