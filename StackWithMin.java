import java.util.Stack;

public class StackWithMin extends Stack<Integer>{
	Stack<Integer> s2;
	public StackWithMin(){
		s2=new Stack<>();
	}
	
	public void push(int value){
		super.push(value);
		if(value<=min())s2.push(value);
	}
	
	public Integer pop(){
		int x=super.pop();
		if(x==min()) s2.pop();
		return x;
	}
	
	public int min(){
		if(s2.isEmpty())return Integer.MAX_VALUE;
		return s2.peek();
	}
}
