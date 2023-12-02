class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int minDiv = Integer.MAX_VALUE;
        int n = nums.length;

        int max = nums[0];

        for(int i=1; i<n; i++){
            max = Math.max(max, nums[i]);
        }

        //the divisor will lie in range [1-max]

        int low = 1;
        int high = max;

        while(low <= high){
            int mid = (low + high)/2;

            //divide the array mid and store it's sum
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += (nums[i] + mid - 1) / mid; 
            }

            if(sum <= threshold){
                high = mid - 1;
            }
            else if(sum > threshold){
                //we need bigger divisor
                low  = mid + 1;
            }
        }

        return low;
    }
}
