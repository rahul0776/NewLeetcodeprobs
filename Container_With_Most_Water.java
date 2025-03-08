class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int max = 0;
        int n = height.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(height[i]<=height[j]){
                res = height[i]*(j-i);
                max = Math.max(res,max);
                i++;
            }
            else if(height[i]>=height[j]){
                res = height[j]*(j-i);
                max = Math.max(res,max);
                j--;
            }
            
        }
        return max;

    }
}
