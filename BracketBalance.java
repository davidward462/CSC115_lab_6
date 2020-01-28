/*
 * File: BracketBalance.java
 * Created by Tianming Wei
 * Example code created for Lab06, CSC115 201901
 */
 
import java.util.*;

public class BracketBalance {
	public String expression;
	
	public BracketBalance(String expression) {
		this.expression = expression;		
	}
	
	public boolean isEmpty() {
		return expression==null;
	}
	
	/*
	Check if the brackets in the string is balanced. For example, "{[()]}" is balanced, return true.  "{[(])}" is not balanced, return false. Assume the string is not null, nor
	empty.
	*/
	public boolean isBalanced(){
		Stack stack = new Stack();
		for (int i = 0; i < expression.length(); i++)
		{
			String s = expression.substring(i, i+1);
			if (s.equals("{") || s.equals("[") || s.equals("(")) //if there is an opening brace
			{
				stack.push(s);
			}
			else if (s.equals("}") || s.equals("]") || s.equals(")")) //if there is a closing brace
			{
				if (stack.empty)//if stack empty
				{
					return false;//not balenced
				}
				else //if stack not empty
				{
					String x = stack.pop();
					if (s.equals("{"))
					{
						
					}
					else if (s.equals("["))
					{
						
					}
					else if (s.equals("("))
					{
						
					}
				}
			}
		}
		System.out.println("STACK: " + stack);
		return true;
	}
}