import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Node <T>{

		T value;
		public Node next;

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
public class LinkList<T> {

	Node current;
	Node first;
	Integer size = -1;
	
	

	public void print() {
		Node temp=first;
		while (temp!= null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printRecursiveReverse(Node node) {
		
		
		if(node==null)
				return ;
			
		
		printRecursiveReverse(node.next);
		
		System.out.println(node.value);
		
		
	}
	
  public void printRecursive(Node node) {
		
		
		if(node==null)
				return ;
			
		System.out.println(node.value);
		printRecursive(node.next);
		
				
		
	}
	
	public void add(T value) {
		Node node = new Node();
		node.setValue(value);
		if (current == null) {

			current = node;
			first = node;
			size++;
		} else {
			current.setNext(node);
			current = node;
			size++;
		}

	}

	public void addAtFirst(T value) {
		Node node = new Node();
		node.setValue(value);

		if (current == null) {
			current = node;
			first = node;
			size++;
		} else {
			node.setNext(first);
			first = node;
			size++;
		}

	}
// print and make a linked list as reverse
	public void printReverse() {

		Node prev = null;
		Node next = null;
		current=first; // need to make current as as first as list is reversed
		while (first != null) {

			next = first.next;
			first.next = prev;
			prev = first;
			first = next;

		}
		
		
		first = prev;
	}
	// print and make a linked list as reverse with recursive
	public Node printReverseRecursiveWay(Node first1, Node prev) {

		
		if(first1 == null) {
			
			current=first;  // need to make current as as first as list is reversed
			first=prev;
			
			return first;
			
		}
					
			Node next= first1.next;	
			first1.next = prev;
			prev = first1;
			
			printReverseRecursiveWay(next ,prev);
 
		return first;
		
	}


	public Node get(Integer index) {

		Integer count = 0;

		Node temp = first;
		if (temp.next == null && index == 0) {
			return temp;
		} else {

			while (temp.next != null) {

				if (count == index) {
					return temp;
				} else {
					count++;
					temp = temp.next;
				}
			}
		}
		return null;

	}

	public static void main(String args[]) {
		LinkList<Integer> lst = new LinkList<Integer>();

		// Addign to the first
		lst.addAtFirst(3000);
		lst.addAtFirst(2000);
		lst.addAtFirst(1000);
		
		System.out.println("***** Print With Recursive******");
		lst.printRecursive(lst.first);
		System.out.println("***** Print With Recursive Reverse******");
		lst.printRecursiveReverse(lst.first);
		
		lst.printReverseRecursiveWay(lst.first, null);
		 
		System.out.println("***** Print ******");
		lst.print();

		System.out.println("***** Adding 50 100 and 200 ******");
		// Addign to the last
		lst.add(50);
		lst.add(100);
		lst.add(200);
		
		System.out.println("***** Adding 50 100 and 200 and print******");
		lst.print();

		Node node = lst.get(1);
		System.out.println("get" + node.getValue());

		System.out.println("***** Print  Reverse******");
		lst.printReverse();
		lst.print();
		
		lst.add(500);
		System.out.println("***** Print ******");
		lst.print();
		
		Collections.sort(new ArrayList<String>(), (o1,o2)-> o1.compareTo(o2));
				
				
				 
		 
		
		

	}
}
