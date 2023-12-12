class Solution {
    public void merge(int nums[], int l, int mid, int h){
        //make temp array to store sorted array
        int temp[] = new int[h-l+1];

        //initialize pointers
        int i = l;
        int j = mid + 1;
        int k = 0;  //to track index of temp

        while(i <= mid && j<=h){
            if(nums[i] < nums[j]){
                temp[k++] = nums[i++];    
            }
            else{
                temp[k++] = nums[j++];
            }
        }

        //left
        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=h){
            temp[k++] = nums[j++];
        }

        //copy temp to nums
        for(k =0, i=l;k<temp.length;k++,i++)
        {
            nums[i] = temp[k];
        }

    }

    public void mergeSort(int nums[], int l, int h){
        //base condition
        if(l>=h){
            return;
        }

        //calculate mid
        int mid = l + (h-l)/2;

        //call merge for left half
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, h);
        merge(nums, l, mid, h);
    }
    public int[] sortArray(int[] nums) {
        
        mergeSort(nums, 0,nums.length - 1);
        return nums;
    }
}
