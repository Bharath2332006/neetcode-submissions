class Solution {
    public int trap(int[] height) {
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        int sum=0;
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i-1]);
        }
        for(int j=height.length-2;j>=0;j--){
            right[j]=Math.max(right[j+1],height[j+1]);
        }
        for(int i=0;i<height.length;i++){
            int count=Math.min(left[i],right[i]);
            int temp=count-height[i];
            if(temp<0) temp=0;
            sum+=temp;
        }
        return sum;
    }
}
