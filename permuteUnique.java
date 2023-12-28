class Solution {
    public void helper(int n, int[] nums, int[] tracker, List<List<Integer>> myList, List<Integer> innerList){
        if(n == 0){
            myList.add(new ArrayList<>(innerList));
            return;
        }

        for(int i=0; i< nums.length; i++){
            if(i>0 && nums[i] == nums[i-1] && tracker[i-1] == 0)
                continue;

            if(tracker[i] == -1){
                innerList.add(nums[i]);
                tracker[i] = 0;

                helper(n-1, nums, tracker, myList, innerList);

                tracker[i] = -1;
                innerList.remove(innerList.size() - 1);
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
        int n = nums.length;

        int tracker[] = new int[n];
        Arrays.fill(tracker, -1);
        Arrays.sort(nums);

        helper(n, nums, tracker, myList, new ArrayList<Integer>());

        return myList;
    }
}
