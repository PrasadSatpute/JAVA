package collectionConcept.Iterable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class MyIterableClass<T> implements Iterable<T>
{
	

    private List<T> list;
 
    public MyIterableClass(T [] t) {
 
        list = Arrays.asList(t);
        Collections.reverse(list);
    }

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}
	
}

public class MyIterable{

	
	public static void main(String [] args) {
		 
        Integer [] ints = {1, 2, 3};
 
        MyIterableClass<Integer> myList = new MyIterableClass<>(ints);
 
        for (Integer i : myList) {
 
            System.out.println(i);
        }
    }

}
