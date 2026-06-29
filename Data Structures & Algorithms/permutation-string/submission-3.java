class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int ic=0;
        for(char c: s1.toCharArray()){
            if((c-'0')%2==0) ic+= (c-'0')*(-100);
            else ic+=(c-'0')*5;
        }
        for(int i=0;i<s2.length()-s1.length()+1;i++){
            int sc=0;
            for(int j=i;j<i+s1.length();j++){
                if((s2.charAt(j)-'0')%2==0) sc+=(s2.charAt(j)-'0')*(-100);
                else sc+=(s2.charAt(j)-'0')*5;
            }
            if(sc==ic) return true;
        }
        return false;
    }
}
