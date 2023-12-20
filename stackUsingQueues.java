class MyStack {

    Queue<Integer> myQueue;

    public MyStack() {
        myQueue = new LinkedList<>();
    }
    
    public void push(int x) {
        Queue<Integer> tempQueue = new LinkedList<>();

        while(!myQueue.isEmpty()){
            tempQueue.add(myQueue.poll());
        }

        myQueue.add(x);

        while(!tempQueue.isEmpty()){
            myQueue.add(tempQueue.poll());
        }
    }
    
    public int pop() {
        return myQueue.poll();
    }
    
    public int top() {
        return myQueue.peek();
    }
    
    public boolean empty() {
        return myQueue.isEmpty();
    }
}
