
import java.util.*;

class Solution
{
	public static Stack<Integer> sortstack(Stack<Integer>
											st)
	{
		Stack<Integer> s = new Stack<Integer>();
		while(!st.isEmpty())
		{
			int tmp = st.pop();
			while(!s.isEmpty() && s.peek()
												> tmp)
			{
			st.push(s.pop());
			}
			s.push(tmp);
		}
		return s;
	}
	public static void main(String args[])
	{
		Stack<Integer> st = new Stack<Integer>();
		st.add(34);
		st.add(3);
		st.add(31);
	
		Stack<Integer> tmpStack=sortstack(st);
		System.out.println("Sorted numbers are:");
	
		while (!tmpStack.empty())
		{
			System.out.print(tmpStack.pop()+" ");
		}
	}
}
