class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;

        int maxWater = 0;
        while(l<r){
            int width = r-l;
            int minHeight = Math.min(heights[l],heights[r]);
            int area = width*minHeight;
            maxWater  =  Math.max(maxWater,area);

            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxWater;
    }
}
