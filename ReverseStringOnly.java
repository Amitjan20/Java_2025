package interview25march;

//Input - A@B$CD#R
//output - R@D$CB#A


public class ReverseStringOnly {

	public static void main(String[] args) {
		
		String input = "A@B$CD#R";
		char[] inputArr = input.toCharArray();
		int i = 0;
		int j = inputArr.length-1;
		
		while(i<j){
			
			while(i<j && !(Character.isLetterOrDigit(inputArr[i]))){
				i++;
			}
			
			while(i<j && !(Character.isLetterOrDigit(inputArr[j]))){
				j--;
			}
			
			if(i<j){
				char temp = inputArr[i];
				inputArr[i] = inputArr[j];
				inputArr[j] = temp;
				i++;
				j--;
			}
			
		}
		
		System.out.println(new String(inputArr));

	}

}
