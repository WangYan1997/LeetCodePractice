import java.util.Stack;

class Solution {
	public String removeDuplicates(String S) {
		Stack <Character> stack = new Stack<>();
		int l = S.length();
		StringBuffer str = new StringBuffer();

		for (int i = 0; i < l; i++) {
			char c = S.charAt(i);

			if (!stack.isEmpty()) {
				if (stack.peek() == c) {
					stack.pop();
					continue;
				}
			}
			stack.push(c);
		}
		
		for(char ch : stack) {
			str.append(ch);
		}
		
		return str.toString();
	}
}