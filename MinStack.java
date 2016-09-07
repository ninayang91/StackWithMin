import java.util.Stack;

public class MinStack {
	
	int min=Integer.MAX_VALUE;
	Stack stack=new Stack();
	
	public void stackPush(int x){
		stack.push(x-min);
		if(x<min){
			min=x;
		}
	}
	
	public int stackPop() throws Exception{
		if(stack.isEmpty()) throw new Exception("Stack is empty");
		int x=(int)stack.pop();
		if(x<0)min-=x;
		return x+min;
	}
	
	
	public int min(){
		return min;
	}
	
	

}
