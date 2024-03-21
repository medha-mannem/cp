class Solution {
    boolean isOperator(String ch){
            if(ch.equals("+") || ch.equals("C") || ch.equals("D") ){
                return true;
            }
            return false;
    }
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack();
        for(int i=0;i<operations.length;i++){
            String ch = operations[i];
            if(isOperator(ch)){
                if(ch.equals("+")){
                    int x = stk.pop();
                    int y = stk.pop();
                    int z = x+y;

                    stk.push(y);
                    stk.push(x);
                    stk.push(z);
                }
                else if(ch.equals("D")){
                    stk.push(stk.peek()*2);
                }
                else if(ch.equals("C")){
                    stk.pop();
                }
            }else{
                    stk.push(Integer.parseInt(ch));
            }
        }
        int sum=0;
        while (stk.size() > 0) sum += stk.pop();
        return sum;
    }
}
