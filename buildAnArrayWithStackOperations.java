class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList();
        n=1;
        int i=0;
        int x = target.length;
        while(x>0){
            if(n==target[i]){
                res.add("Push");
                i++;
                x--;
            }
            else{
                res.add("Push");
                res.add("Pop");
            }
            n++;
        }
        return res;
    }
}
