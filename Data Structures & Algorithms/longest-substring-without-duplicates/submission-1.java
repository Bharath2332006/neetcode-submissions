class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> map=new HashMap<>();
            int count=0;
            for(int j=i;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(map.get(s.charAt(j))>1) break;
                count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
