class BestTimeToBuynSellStock {

    // Method to calculate maximum profit
    int stocks(int[] arr, int n) {
        int maxProfit = 0;
        int mini = arr[0]; 

        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]); 
            int curProfit = arr[i] - mini; 
            maxProfit = Math.max(maxProfit, curProfit); // Update maximum profit
        }

        return maxProfit; 
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4}; 
        int n = arr.length;

        BestTimeToBuynSellStock obj = new BestTimeToBuynSellStock(); 
        int maxProfit = obj.stocks(arr, n); 
        System.out.println("Max Profit: " + maxProfit); 
}

}
