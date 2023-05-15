package org.sunbeam.dac.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sunbeam.dac.model.Account;
import org.sunbeam.dac.model.Customer;

public class MapTest {
	private Map<Account, Customer> map;
	public void setMap(Map<Account, Customer> map) {
		this.map = map;
	}
	public void addEntry(Account[] keys, Customer[] values) {
		for( int index = 0; index < keys.length; ++ index ) {
			this.map.put(keys[ index ], values[ index ] );
		}
	}
	public Customer findEntry(int accountNumber) {
		Account key = new Account( );
		key.setNumber(accountNumber);
		if( this.map.containsKey(key))
			return this.map.get(key);
		return null;
	}
	public boolean removeEntry(int accountNumber) {
		Account key = new Account( );
		key.setNumber(accountNumber);
		
		if( this.map.containsKey(key)) {
			this.map.remove(key);
			return true;
		}
		return false;
	}
	public void printEntries() {
		Set<Entry<Account, Customer>> entries = this.map.entrySet();
		for (Entry<Account, Customer> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
