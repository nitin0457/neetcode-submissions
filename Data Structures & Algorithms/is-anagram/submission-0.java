class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       }
       char k[]= s.toCharArray();
       char n[]=t.toCharArray();
       Arrays.sort(k);
       Arrays.sort(n);
       for(int i=0; i<k.length; i++){
        if(k[i]!=n[i]){
            return false;
        }
       }
       return true;
    }
}
