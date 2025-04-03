class Solution {
    public int maxRepeating(String sequence, String word) {
        int res = 0;
        StringBuilder sb = new StringBuilder();
       
        while(sb.length()<=sequence.length()){
            sb.append(word);
            if(sequence.contains(sb.toString())){
                res++;
            }
            else break;

            
        }
        return res;
    
    }
}
