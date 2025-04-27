package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class NoTwoCharsNext {

	public static void main(String[] args) {

		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		PriorityQueue<Character> pq = new PriorityQueue<Character>((a, b) -> hm.get(b) - hm.get(a));
		int k = 0;
		StringBuilder sb = new StringBuilder();
		String s = "";

		for (int i = 0; i < s.length(); i++) {
			if (hm.get(s.charAt(i)) != null) {
				hm.put(s.charAt(i), hm.get(s.charAt(i) + 1));
			} else {
				hm.put(s.charAt(i), 1);
			}
		}

		pq.addAll(hm.keySet());

		while (pq.size() > 0) {
			char current = pq.peek();
			char next = pq.peek();

			sb.append(current);
			sb.append(next);
			hm.put(current, hm.get(current) - 1);
			hm.put(next, hm.get(next) - 1);
			if (hm.get(current) > 0)
				pq.offer(current);
			if (hm.get(next) > 0)
				pq.offer(next);

		}
		
		if(pq.size()>0){
			char p = pq.poll();
			sb.append(p);
			if(hm.get(p) > 0){
				System.out.println("");
			}
		}
			
		System.out.println("");
	}

}
