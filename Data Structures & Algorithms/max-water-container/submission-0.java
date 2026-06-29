class Solution {
    public int maxArea(int[] heights) {
        int ans=0;
        int i=0,j=heights.length-1;
        while(i<j){
            int area=Math.min(heights[i],heights[j])*(j-i);
            ans=Math.max(area,ans);
            if(heights[i]<heights[j]) i++;
            else j--;
        }return ans;
    }
}
