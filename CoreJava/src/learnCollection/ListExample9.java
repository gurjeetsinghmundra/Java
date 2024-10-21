package learnCollection;

import java.util.Stack;

//Stack
public class ListExample9 {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(12);
		stack.push(14);
		stack.push(20);
		stack.push(20);
		//push to insert
		//pop to remove last added item
		//peek to see recent insert
		
		
		System.out.println(stack);
		System.out.println(stack.search(20));//search element
		//the last inserted item will have index 1
		
		System.out.println("=============================================");
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.empty());//will return boolean value
	}

}
