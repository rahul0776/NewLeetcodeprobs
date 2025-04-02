class Solution {
    public long maximumTripletValue(int[] nums) {
        long res = 0;
        long max;
        int i = 0;
        int j;
        int k;
        int n = nums.length;
        while(i<n-2){
            j=i+1;
            while(j<n-1){
                k = j+1;
                while(k<n){
                    max = (long) (nums[i] - nums[j]) * nums[k];
                    if(max>0){
                        res = Math.max(res,max);
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        return res;
    }
}
