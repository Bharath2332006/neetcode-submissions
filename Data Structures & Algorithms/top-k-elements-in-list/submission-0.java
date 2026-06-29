class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int key[]=new int[map.size()];
        int value[]=new int[map.size()];
        int il=0;
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            key[il]=entry.getKey();
            value[il]=entry.getValue();
            il++;
        }
        for(int i=0;i<value.length-1;i++){
            for(int j=i+1;j<value.length;j++){
                if(value[i]>value[j]){
                    int temp1=value[i];
                    value[i]=value[j];
                    value[j]=temp1;
                    int temp2=key[i];
                    key[i]=key[j];
                    key[j]=temp2;
                }

            }
        }
        int a=key.length-1;
        for(int i=0;i<k;i++){
            ans[i]=key[a--];
        }
        return ans;
        
        
    }
}
