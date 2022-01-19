class Maxsubarray {
    public int maxSubArray(int[] nums) {
        
        int sum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > sum) {
                sum = currentSum;
            } 
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return sum;
    }
}
