import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		
		String str = "a(()))))))))()(())";
		boolean[] tempStore = new boolean[str.length()];
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '('){
				stack.push(i);
			}else{
				if(!stack.isEmpty()){
					if(str.charAt(i) == ')'){
						tempStore[i] = true;
						tempStore[stack.pop()] = true;
					}
				}
			}
		}

		for(int i=0;i<str.length();i++){
			if(tempStore[i] || (str.charAt(i) != '(' && str.charAt(i) != ')')){
				result.append(str.charAt(i));
			}
		}
		
		System.out.println(result.toString());
	}

}
