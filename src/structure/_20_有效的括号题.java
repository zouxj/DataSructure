package structure;

import _03_栈.Stack;

public class _20_有效的括号题 {
	
	public boolean isV(String msg) {
		
		while (msg.contains("[]")||msg.contains("{}")||msg.contains("()")) {
			msg.replace("[]", "");
			msg.replace("{}", "");
			msg.replace("()", "");
		}
		return msg.length()==0;
		
	}
	
	public static boolean isStack(String s) {
		Stack<Character> stack=new Stack<Character>();
		int len =s.length();
		for (int i = 0; i < len; i++) {
			char c= s.charAt(i);
			if (c=='('||c=='{'||c=='[') {
				stack.push(c);
			}else {
				if (stack.isEmpty()) return false;
				char left=(char) stack.pop();
				if (left=='('&&c!='(')  return false;
				if (left=='{'&&c!='{')  return false;
				if (left=='['&&c!='[')  return false;
			}
			
			
		}
		return stack.isEmpty();
	}
public static void main(String[] args) {
	System.out.println(isStack("{}"));
}
}
