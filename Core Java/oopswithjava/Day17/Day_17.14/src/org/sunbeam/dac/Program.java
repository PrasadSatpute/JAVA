package org.sunbeam.dac;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

class Pair< K, V > implements Entry<K, V>{
	private K key;
	private V value;
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		return this.key;
	}
	@Override
	public V getValue() {
		return this.value;
	}
	@Override
	public V setValue(V value) {
		this.value = value;
		return this.value;
	}
}
public class Program {
	public static void main(String[] args) {
		Entry<Integer, String> e1 = new Pair<>( 1, "DAC");
		Entry<Integer, String> e2 = new Pair<>( 2, "DMC");
		Entry<Integer, String> e3 = new Pair<>( 3, "DESD");
		Entry<Integer, String> e4 = new Pair<>( 4, "DBDA");
		
		Set< Entry<Integer, String> > set = new HashSet<Entry<Integer,String>>( );
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		
	}				
}
