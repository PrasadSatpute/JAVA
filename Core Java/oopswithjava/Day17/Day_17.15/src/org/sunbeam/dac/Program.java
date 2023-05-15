package org.sunbeam.dac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program {
	private static Map<Integer, String> getMap() {
		Map<Integer, String> map = new Hashtable<>( );
		map.put(1, "Nagpur");
		map.put(2, "Delhi");
		map.put(3, "A.Nagar");
		map.put(4, "Mumbai");
		map.put(5, "Kolhapur");
		return map;
	}
	private static void printKeys(Map<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		for (Integer key : keys)
			System.out.println(key);
	}	
	private static void printValues(Map<Integer, String> map) {
		Collection<String> values = map.values();
		for (String value : values) 
			System.out.println(value);
	}
	private static void printEntries(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"	"+value);
		}
	}	
	private static List<String> getCities(Map<Integer, String> map) {
		//Collection<String> values = map.values();
		//List<String> cities = new ArrayList<String>( values );
		
		List<String> cities = new ArrayList<String>( map.values() );
		Collections.sort(cities);
		//cities.sort(null);
		return cities;
	}
	private static void findAndRemoveEntry(Map<Integer, String> map, Integer key) {
		if( map.containsKey(key)) {
			//String value = map.get(key);
			String value =  map.remove(key);
			System.out.println(key+"	"+value);
		}else
			System.out.println(key+" not found");
	}
	public static void main(String[] args) {
		Map<Integer, String> map = Program.getMap( );
		
		//Program.printKeys( map );
		
		//Program.printValues( map );
		
		//Program.printEntries( map );
		
		//List<String> cities = Program.getCities( map );
		//cities.forEach(System.out::println);
		
		//Program.findAndRemoveEntry( map, 3 );
	}
}
