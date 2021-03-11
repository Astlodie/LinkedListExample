package linkedlistexample;
import java.util.*;
public class LinkedListExample {
	public static void main(String args[]){

		LinkedList<String> list=new LinkedList<String>();

		//Adding elements to the Linked list
		list.add("Elodie");
		list.add("Carol");
		list.add("Olivia");

		//Adding an element to the first position
		list.addFirst("Theo");

		//Adding an element to the last position
		list.addLast("Mark");

		//Adding an element to the 4th position
		list.add(3, "Nancy");

		//Iterating LinkedList
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	} 

}
