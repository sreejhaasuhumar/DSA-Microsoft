package Microsoft;

import java.util.Stack;

public class RemoveAdjacents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="CABCD";
		String a=transform(s);	
		System.out.println(a);
	}

	
	private static String transform(String S) {
        Stack<Character> stack = new Stack<>();
        for(int i = S.length()-1; i >= 0; i--) {
            char ch = S.charAt(i);
            if(!stack.isEmpty()) {
                char topChar = stack.peek();
                if(topChar == 'A' && ch == 'B' || topChar == 'B' && ch == 'A' || topChar == 'C' && ch == 'D' ||
                    topChar == 'D' && ch == 'C') {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
}
}
