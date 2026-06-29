class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        int visited[]=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]!=1){
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                for(int j=i+1;j<strs.length ;j++){
                    if(visited[j]!=1){
                        if(Anagram(strs[i],strs[j])){
                            temp.add(strs[j]);
                            visited[j]=1;
                        }
                    }
                }
                list.add(temp);
            }
        }
        return list;
    }
    public boolean Anagram(String a, String b){
        if(a.length()!=b.length()) return false;
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
        
        
    }
}
