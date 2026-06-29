class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){

            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            char a=Character.toUpperCase(s.charAt(i));
            char b=Character.toUpperCase(s.charAt(j));
            if(a!=b) return false;
            
            i++;
            j--;
        }
        return true;
    }
}
