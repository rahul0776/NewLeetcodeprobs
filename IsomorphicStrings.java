class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            int last_s = map_s.getOrDefault(s.charAt(i),i);
            int last_t = map_t.getOrDefault(t.charAt(i),i);

            if(last_s!=last_t) return false;

            map_s.put(s.charAt(i),i);
            map_t.put(t.charAt(i),i);
        }
        return true;
    }
}
