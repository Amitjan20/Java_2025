package jan2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("");
		list.add("");
		list.add("");
		list.add("tbd");
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return	o1.compareTo(o2);
			}
			
		});
		
		list.stream().forEach(s -> System.out.print(s));

	}

}
