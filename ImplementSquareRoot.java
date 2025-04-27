package jan2025;

public class ImplementSquareRoot {
	static int ans = 0;
	public static void main(String[] args) {

		int num = 19;
		int s = 1;
		int e = num;
		
		while(s<=e){
			int mid = s + (e-s)/2;
			if(mid == num/mid){
				ans=mid;
				break;
			}else if(mid < num/mid){
				ans = mid;
				s = mid + 1;
			}else{
				e = mid - 1;
			}
		}
		System.out.println(ans);
	}
	
}
