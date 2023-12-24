class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>(Comparator.reverseOrder());
        
        int n = nums.length;
        for(int i=0; i<n; i++){
            myQueue.add(nums[i]);
        }

        for(int i=1; i<k; i++){
            myQueue.remove();
        }

        return myQueue.remove();
    }
}
