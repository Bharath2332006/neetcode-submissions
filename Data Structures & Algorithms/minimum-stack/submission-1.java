class MinStack {
    public Stack<Integer> minstack;
    public MinStack() {
         minstack =new Stack<>();
    }
    
    public void push(int val) {
        minstack.push(val);
    }
    
    public void pop() {
        minstack.pop();
    }
    
    public int top() {
        return minstack.peek();
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int n: minstack){
            min=Math.min(n,min);
        }
        return min;
    }
}
