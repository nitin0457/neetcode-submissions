class Solution {
    public String longestCommonPrefix(String[] strs) {
           Arrays.sort(strs);
        String s=strs[0];
        String s1=strs[strs.length-1];
         int i=0;
        for( i=0; i<s.length();i++){
            if(s.charAt(i)!=s1.charAt(i)){
                break;
            }
        }
        return s.substring(0,i);
    }
}