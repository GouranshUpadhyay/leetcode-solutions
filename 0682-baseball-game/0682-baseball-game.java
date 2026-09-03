class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String op : operations){
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("+")){
                int last=stack.pop();
                int secondlast=stack.peek();
                int sum=last+secondlast;
                stack.push(last);
                stack.push(sum);
            }
            else if(op.equals("D")){
                int last=stack.peek();
                int ans=last*2;
                stack.push(ans);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}