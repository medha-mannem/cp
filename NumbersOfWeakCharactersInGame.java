class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? (a[1]-b[1]) : (b[0]-a[0]));
        int count = 0, max = 0;
        for(int[] arr: properties){
            if(arr[1] < max)    count++;
            max = Math.max(max, arr[1]);
        }
        return count;
    }
}
