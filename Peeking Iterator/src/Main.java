import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(90);
		list.add(4);
		
		Iterator<Integer> i = list.iterator();
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		PeekingIterator peekiter = new PeekingIterator(i);
		System.out.println(peekiter.peek());
		System.out.println(peekiter.peek());
		System.out.println(peekiter.next());
		System.out.println(peekiter.next());
		System.out.println(peekiter.hasNext());
		System.out.println(peekiter.next());
		System.out.println(peekiter.hasNext());
		System.out.println(peekiter.next());
	}

}
