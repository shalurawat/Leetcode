class MyQueue {
    Stack<Integer> myStack;

    public MyQueue() {
        myStack = new Stack<>();
    }
    
    public void push(int x) {
        Stack<Integer> tempStack = new Stack<>();

        while(!myStack.isEmpty()){
            tempStack.push(myStack.pop());
        }

        myStack.push(x);

        while(!tempStack.isEmpty()){
            myStack.push(tempStack.pop());
        }
    }
    
    public int pop() {
        return myStack.pop();
    }
    
    public int peek() {
        return myStack.peek();
    }
    
    public boolean empty() {
        return myStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
