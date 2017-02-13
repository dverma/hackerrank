package challenges;

import java.util.Scanner;
import java.util.Stack;

public class Brackets
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count = 0;
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            
            validateBrackets(s);
            count++;
        }
        System.out.println(count);
    }
	
/*Algorithm:
	1) Declare a character stack S.
	2) Now traverse the expression string.
	    a) If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
	    b) If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and
	       if the popped character is the matching starting bracket then fine else parenthesis are not balanced.
	3) After complete traversal, if there is some starting bracket left in stack then “not balanced”
 */
    static void validateBrackets(String s){
    	Stack<Character> stack = new Stack();
        char upperElement = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                upperElement = stack.peek();
            }
            stack.push(s.charAt(i));
            if (!stack.isEmpty() && stack.size() > 1) {
                if ((upperElement == '[' && stack.peek() == ']') ||
                        (upperElement == '{' && stack.peek() == '}') ||
                        (upperElement == '(' && stack.peek() == ')')) {
                    stack.pop();
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
        return;
    }
	
}
