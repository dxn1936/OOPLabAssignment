package temporary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bubbleSort.BubbleSort;

public class CollectionTest {
	public static void main(String args[]) {
		List<BubbleSort> mylist = new ArrayList<>();
		mylist.add(new BubbleSort("name", "date"));
		BubbleSort bs = new BubbleSort("", "");
		mylist.add(bs);
		
		
		List<String> team = new ArrayList<>();
		team.add("hello");
		team.add("bye");
		team.add("tata");
		System.out.println("size= " + team.size());
		System.out.println("at 0th = " + team.get(0));
		team.remove(0);
		for(String i : team) {
			System.out.println("-->" + i);
		}
		
		Iterator<String> myIterator = team.iterator();
		while(myIterator.hasNext()) {
			System.out.println("@@@> " + myIterator.next());
		}
		
		
		
		
	}
}
