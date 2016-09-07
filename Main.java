
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StackWithMin stack=new StackWithMin();
		stack.push(3);
		stack.push(8);
		stack.push(9);
		stack.push(2);
		stack.push(1);
		System.out.println(stack.min());
		System.out.println(stack.pop());
		System.out.println(stack.min());
		System.out.println(stack.pop());
		System.out.println(stack.min());
		System.out.println(stack.pop());
		System.out.println(stack.min());
		System.out.println(stack.pop());
		System.out.println(stack.min());
		System.out.println(stack.pop());
		System.out.println(stack.min());
		System.out.println(stack.pop());
		
/*		ThreeStacks stacks=new ThreeStacks();
		stacks.push(0, 10);
		stacks.push(1, 20);
		stacks.push(2, 30);
		System.out.println(stacks.pop(2));*/
		

	}
	
	//design a stack, push, pop and returns min value all in O(1) time
	
	

}
