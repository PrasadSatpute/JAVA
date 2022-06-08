package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Acer", 12, 700));
		
//		Collections.sort(laps);		//Comparable
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			public int compare(Laptop l1, Laptop l2) {
				if(l1.getPrice() > l2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		
		Map<String, String> maplist = new Hashtable<String, String>();
		
		maplist.put("Prasad1", "IT");
		maplist.put("Prasad2", "IT");
		maplist.put("Prasad3", "IT");
		maplist.put("Prasad4", "IT");
		
		Set<String> mapset = maplist.keySet();
		
		for(String m : mapset)
		{
			System.out.println(" "+maplist.get(m));
		}
		
		Collections.sort(laps,com);
		
		for(Laptop l : laps)
		{
			System.out.println(l);
		}
	}
}
