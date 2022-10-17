package collection3_220930;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++)
			stack.push(groupA[i]);
		// Stack에 값을 추가하고 싶다면 push(value)라는 메소드를 활용하면 됩니다. 
		while( ! stack.isEmpty())
			out.println( stack.pop());

	}

}
