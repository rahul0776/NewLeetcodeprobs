class Solution {
    public long maximumTripletValue(int[] nums) {
       long maxTrip = 0, maxDif = 0, maxEle = 0;
       for(int num: nums){
        maxTrip = Math.max(maxTrip, maxDif * num);
        maxDif = Math.max(maxDif, maxEle - num);
        maxEle = Math.max(maxEle, num);
       }
       return maxTrip;
    }
}
