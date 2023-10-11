class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int l=heights.length;
        Map<Integer,String> map=new HashMap();

        for(int i=0;i<l;i++)
            map.put(heights[i],names[i]);
        Arrays.sort(heights);

        String[] ans=new String[l];

        for(int i=l-1,j=0;i>=0;i--)
            ans[j++]=map.get(heights[i]);

    return ans;
    }
}
