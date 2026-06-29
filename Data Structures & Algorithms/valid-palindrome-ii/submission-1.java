class Solution {
    public boolean validPalindrome(String s) {
        int count=0,i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return (ispalindrom(s,i+1,j) || ispalindrom(s,i,j-1));
            }
            i++;
            j--;

        }
        return true;
    }
    public boolean ispalindrom(String s, int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}