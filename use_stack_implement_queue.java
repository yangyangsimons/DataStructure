Class MyQueue{
	Stack<Integer> oldStack;
	Stack<Integer> newStack;

	public MyQueue(){
		oldStack = new Stack<>();
		newStack = new Stack<>();
	}
	public void push(int x){
		oldStack.push(x);
	}
	public int pop(){
		if(newStack.empty()){
			while(!oldStack.empty()){
				newStack.push(oldStack.pop());
			}
		}
		return newStack.pop();
	}

	public int peek(){
		if(newStack.empty()){
			while(!oldStack.empty()){
				newStack.push(oldStack.pop());
			}
		}
		return newStack.peek();
	}

	public boolean empty(){
		if(oldStack.empty() && newStack.empty()){
			return true;
		}
		return false;
	}
}