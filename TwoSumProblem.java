class TwoSumProblem {
    static boolean test(int[] arr, int n, int target) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true; // Pair found
            } else if (sum < target) {
                left++; 
            } else {
                right--; 
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8};
        int n = arr.length;
        int target = 9;

        boolean result = test(arr, n, target);
        System.out.println("Pair found: " + result);
    }
}
