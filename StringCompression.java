package interview;

public class StringCompression {

	public static void main(String[] args) {
		
		String s = "aabbbccceee";
		StringBuilder sb = new StringBuilder();
		char last = s.charAt(0);
		int count = 1;
		for(int i=1;i<s.length();i++){
			char c = s.charAt(i);
			if(c==last){
				count++;
				if(i==s.length()-1){
					sb.append(last);
					sb.append(count+"");
				}
			}else{
				sb.append(last);
				sb.append(count+"");
				count = 1;
				last = s.charAt(i);
			}
				
		}

		System.out.println(sb);
	}

}
