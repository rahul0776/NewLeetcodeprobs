class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum =0;
        int l_sum =0;
        for(int i = 0; i< nums.length; i++){
            total_sum += nums[i];
        }
        for(int i = 0; i< nums.length; i++){
            if(i!=0){
                l_sum += nums[i-1];
            }
            if(total_sum - nums[i] - l_sum == l_sum){
                return i;
            }
        }
        return -1;
    }
}
