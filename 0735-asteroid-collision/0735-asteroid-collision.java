class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque <Integer> stack=new ArrayDeque<>();
        for(int ast : asteroids){
            if(ast>0){
                stack.push(ast);
            }
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -ast){
                    stack.pop();
                }
            
            if(!stack.isEmpty() && stack.peek() == -ast){
                stack.pop();
            }
            else if(stack.isEmpty() || stack.peek() < 0){
                stack.push(ast);
            }
        }
    }
        int[] ans=new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
    }
}