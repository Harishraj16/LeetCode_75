class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>(n);
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,candies[i]);
        }
        for(int i=0;i<n;i++){
            result.add(candies[i]+extraCandies >= maxi);
        }
        return result;
    }
}
