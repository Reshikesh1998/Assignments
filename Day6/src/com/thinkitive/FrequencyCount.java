package com.thinkitive;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCount {
	
	public static void main(String[] args) {
		Map<String, Integer>  map = new TreeMap<String, Integer>();
		
		String[] s = "hello hi hi hello was were was were hi hello".split(" ");
		for(String x : s) 
		{
			if (map.get(x) !=null) {
			map.put(x, map.get(x)+1);
			}
			else 
			{
				map.putIfAbsent(x, 1);
			}
		}
		
		System.out.println(map);
	
	
	
	Map<String, Integer> hmap = new HashMap<String, Integer>();
	
	for(String x: s) 
	{
		hmap.merge(x, 1, FrequencyCount :: add);
	}

	System.out.println(hmap);
}
	public static Integer add (Integer a, Integer b) 
	{
		return a+b;
	}
}
