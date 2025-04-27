package jan2025;

public class Longestcommonprefix {

	public static void main(String[] args) {
		String[] str = {"flower", "flow", "flight"};
		String prefix = str[0];
		int i =1;
		
		while(i<str.length){
			while(str[i].indexOf(prefix)!=0){
				prefix = prefix.substring(0, prefix.length()-1);
			}
			i++;
			
		}

		System.out.println(prefix);
	}

}
