package org.sunbeam.dac.test;
interface Pair<K, V>{
	public K getKey( );
	public V getValue( );
}
class HashTable<K,V> implements Pair<K,V>{
	private K key;
	private V value;
	public HashTable( K key, V value ) {
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
}
public class Program {
	public static void main(String[] args) {
		//Pair<Integer, String> pair = new HashTable<Integer, String>( );
		
		Pair<Integer, String> pair = new HashTable<>( 1, "SunBeam");
		
		System.out.println("Key	:	"+pair.getKey());
		
		System.out.println("Value	:	"+pair.getValue());
 	}
}
