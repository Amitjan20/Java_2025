package jan2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortByKeys {

	public static void main(String[] args) {


		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(22, 2);
		map.put(12, 2);
		map.put(332, 2);
		map.put(244, 2);
		map.put(1232, 2);
		map.put(4322, 2);
		map.put(46672, 2);
		map.put(672, 5);
		map.put(992, 3);
		List<Integer> temp = new ArrayList<>(map.keySet());
		Collections.sort(temp);
		
		Map<Integer, Integer> newMap = new LinkedHashMap<Integer, Integer>();
		for(Integer i : temp)
			newMap.put(i, map.get(i));
		
		
				
				for(Map.Entry<Integer, Integer> e : newMap.entrySet()){
			//System.out.println(e.getKey() + " " + e.getValue());
			
		}
		
		
		//sortBasaedonKeys(map);
		sortBasaedonValues(map);
		
	}

	private static void sortBasaedonKeys(Map<Integer, Integer> map) {
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		
		Map<Integer, Integer> map1 = new LinkedHashMap<>();
		for(Map.Entry<Integer, Integer> e : list){
			map1.put(e.getKey(), e.getValue());
		}
		
		for(Map.Entry<Integer, Integer> e1 : map1.entrySet()){
			System.out.println(e1.getKey() + " " + e1.getValue());
			
		}
		
	}
	
private static void sortBasaedonValues(Map<Integer, Integer> map) {
		
		LinkedHashMap<Integer, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<Integer, Integer> map1 = new LinkedHashMap<>();
		for(Map.Entry<Integer, Integer> e : collect.entrySet()){
			System.out.println(e.getKey() + " : " + e.getValue());
			//System.out.println(e.getValue());
			
		}
		
		for(Map.Entry<Integer, Integer> e1 : map1.entrySet()){
			System.out.println(e1.getKey() + " " + e1.getValue());
			
		}
		
		Iterator<Map.Entry<Integer, Integer>> itr = map1.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry<Integer, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
		
		
	}
}
