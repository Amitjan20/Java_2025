package jan2025;

import java.util.PriorityQueue;

public class KthSmallestElementinArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
		
		for(int i=0;i<arr.length;i++){
			pq.offer(arr[i]);
			if(pq.size()>4)
				pq.poll();
		}

		System.out.println(pq.peek());
	}

}
