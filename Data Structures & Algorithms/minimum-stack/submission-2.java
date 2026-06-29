class MinStack {
    public Stack<Integer> minstack;
    public Stack<Integer> min;
    
    public MinStack() {
        minstack =new Stack<>();
        min =new Stack<>();
        
    }  
    public void push(int val) {
        if(min.isEmpty() || min.peek()>=val ) min.push(val);
        else min.push(min.peek());
        minstack.push(val);
    }
    public void pop() {
        if(!minstack.isEmpty()){
            minstack.pop();
            min.pop();
            
        }
    }
    public int top() {
        return minstack.peek();
    }
    public int getMin() {
        // int min=Integer.MAX_VALUE;
        // for(int n: minstack){
        //     min=Math.min(n,min);
        // }
        return min.peek();
    }
}
