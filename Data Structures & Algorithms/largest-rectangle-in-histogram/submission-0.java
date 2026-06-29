class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=-99;
        for(int i=0;i<heights.length;i++){
            int min=heights[i];
            for(int j=i;j<heights.length;j++){
                min=Math.min(min, heights[j]);
                area=Math.max(area,(j-i+1)*min);
            }
        }
        return area;
    }
}
