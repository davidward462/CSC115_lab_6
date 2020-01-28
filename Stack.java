/*
 * File: Stack.java
 * Created by Tianming Wei
 * Example code created for Lab06, CSC115 201901
 */
 
public class Stack {
	public Node top;
	
	public Stack(){
		top = null;
	}
	
	/*
	return true if the stack is empty, false otherwise.
	*/
	public boolean empty(){		
		if (top == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*
	return the object at the top of the stack. The stack is not changed.
	return null if the stack is empty.
	*/
	public String peek() {
		return top.item;		
	}
	
	/*
	remove and return the object at the top of the stack. If the stack is {1, 4, -3}, after the pop operation, the stack is {4, -3} and 1 is returned.
	return null if the stack is empty.
	*/
	public String pop() {
		if (top != null)//if stack empty
		{
			//rewire
			Node p = top;
			top = p.next;
			p.next = null;
			return p.item;
		}
		else
		{
			return null;
		}
	}
	
	/*
	push item at the top of the stack.
	*/
	public void push(String item){
		//create and rewire
		Node n = new Node(item);
		n.next = top;
		top = n;
	}
	
	/*
	return a string representation of the stack. If it is empty, return "{}". Or
    return {2, 4, 9} if the top of the stack is 2, and 4 and 9 in the subsequent nodes.	
	*/
	public String toString(){
		
		Node p = top;
		String s = "{";
		if (p != null)
		{
			while (p.next != null)
			{
				s += p.item + ", ";
				p = p.next;
			}
			s += p.item;
		}
		s += "}";
		return s;
	}
	
	/*
	write your tester in the main.
	*/
	public static void main(String[] args){
		Stack S = new Stack();
		// tests start ... 
		/*
		System.out.println(myStack);
		System.out.println("\nPUSH TEST");
		myStack.push("A");
		System.out.println(myStack);
		myStack.push("B");
		myStack.push("C");
		myStack.push("D");
		System.out.println(myStack);
		System.out.println(myStack.empty());
		System.out.println("\nPOP TEST");
		String m = myStack.pop(); 
		System.out.println(m);
		System.out.println(myStack);
		String n = myStack.pop();
		String o = myStack.pop();
		String p = myStack.pop();
		System.out.println(myStack);
		System.out.println(myStack.empty());
		System.out.println("\nSTRESS TEST");
		for (int i = 0; i < 50; i++)
		{
			myStack.push(Integer.toString(i+1));
		}
		System.out.println(myStack);
		
		for (int i = 0; i < 50; i++)
		{
			myStack.pop();
		}
		System.out.println(myStack);
		
		myStack.push("A");
		myStack.pop();
		System.out.println(myStack);
		String x = myStack.pop(); // null
		System.out.println(x);
		*/
		System.out.println(S);
		S.push("A");
		System.out.println(S);//fails with 1 element
		S.push("B");
		System.out.println(S);//fails with 2 elements
		S.push("C");
		System.out.println(S);//fails with 3 elements
	}
}