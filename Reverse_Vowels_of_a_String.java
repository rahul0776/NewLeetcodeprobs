class Solution {
    public String reverseVowels(String s) {
          int i = 0;
        int j = s.length() - 1;
        char temp = '#' ;   
        char[] arr = s.toCharArray();
        
        while(i < j ){
        
            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u'&& arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U'  )
              i++;              
              else {
                  
                  temp = arr[i]; 
              }     
        
        
            if(arr[j] != 'a' && arr[j] != 'e' && arr[j] != 'i' && arr[j] != 'o' && arr[j] != 'u' && arr[j] != 'A' && arr[j] != 'E' && arr[j] != 'I' && arr[j] != 'O' && arr[j] != 'U' )
              j--;
              
              else {                  
                  if(temp != '#' ){
                   arr[i] = arr[j];
                   arr[j] = temp;
                   temp = '#'; // resetting in case j is found before i just after a swap as temp would still be holding the prev vowel in that case
                   i++;
                   j--;
                  }
                  // if there is nothing in temp yet , keep waiting until we find our next vowel to swap at i 
                  
              }       
        
        }        
        
        return new String (arr);
}
}
                
        
    
