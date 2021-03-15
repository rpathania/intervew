package com.trp.interview.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap----------------------------------------------

		System.out.println("---------------HashMap---------------");
		Map<String, Integer> hmap = new HashMap<>();
		hmap.put("Jan", 1);
		hmap.put("Feb", 2);
		hmap.put("Mar", 3);
		hmap.put("Apr", 4);
		hmap.put("May", 5);
		hmap.put("Jun", 6);
		hmap.put("Jul", 7);
		hmap.put("Aug", 8);
		hmap.put("Sep", 9);
		hmap.put("Oct", 10);
		hmap.put("Nov", 11);
		hmap.put("Dec", 12);
		
		for (Map.Entry<String, Integer> pair: hmap.entrySet()) {
			System.out.println(pair.getKey() +" : " + pair.getValue());
		}
		
		System.out.println("---------------LinkedHashMap---------------");
		//LinkedHashMap-------------------------------------------
		
		Map<String, Integer> lhmap = new LinkedHashMap<>();
		lhmap.put("Jan", 1);
		lhmap.put("Feb", 2);
		lhmap.put("Mar", 3);
		lhmap.put("Apr", 4);
		lhmap.put("May", 5);
		lhmap.put("Jun", 6);
		lhmap.put("Jul", 7);
		lhmap.put("Aug", 8);
		lhmap.put("Sep", 9);
		lhmap.put("Oct", 10);
		lhmap.put("Nov", 11);
		lhmap.put("Dec", 12);
		
		for (Map.Entry<String, Integer> pair: lhmap.entrySet()) {
			System.out.println(pair.getKey() +" : " + pair.getValue());
		}
		
		System.out.println("---------------TreeMap---------------");
		//LinkedHashMap-------------------------------------------
		
		Map<String, Integer> tmap = new TreeMap<>();
		tmap.put("Jan", 1);
		tmap.put("Feb", 2);
		tmap.put("Mar", 3);
		tmap.put("Apr", 4);
		tmap.put("May", 5);
		tmap.put("Jun", 6);
		tmap.put("Jul", 7);
		tmap.put("Aug", 8);
		tmap.put("Sep", 9);
		tmap.put("Oct", 10);
		tmap.put("Nov", 11);
		tmap.put("Dec", 12);
		
		for(Map.Entry<String, Integer> pair: tmap.entrySet()) {
			System.out.println(pair.getKey() +" : " + pair.getValue());
		}
		
		
	}
	
	

}
