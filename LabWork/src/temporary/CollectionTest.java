package temporary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import bubbleSort.BubbleSort;

public class CollectionTest {
	public static void main(String args[]) {
		List<BubbleSort> mylist = new ArrayList<>();
		mylist.add(new BubbleSort("name", "date"));
		BubbleSort bs = new BubbleSort("", "");
		mylist.add(bs);
		
		/*
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
		*/
		
		Iterator myItr;
		
		List<Integer> rollnoList = new ArrayList<>();
		rollnoList.add(1701);
		rollnoList.add(1702);
		rollnoList.add(1703);
		System.out.println("rollnoList= " + rollnoList);
		rollnoList.add(1702);
		System.out.println("rollnoList== " + rollnoList);
		
		Set<Integer> rollnoSet = new HashSet<>();
		rollnoSet.add(1701);
		rollnoSet.add(1702);
		rollnoSet.add(1703);
		System.out.println("rollnoSet= " + rollnoSet);
		rollnoSet.add(1702);
		System.out.println("rollnoSet== " + rollnoSet);
		
		myItr = rollnoList.iterator();
		System.out.println("\nList=");
		printCollection(myItr);
		
		myItr = rollnoSet.iterator();
		System.out.println("\nSet=");
		printCollection(myItr);
		
	}
	static void printCollection(Iterator myItr) {
		while(myItr.hasNext()) {
			System.out.print(myItr.next() + "..");
		}
	}
}
