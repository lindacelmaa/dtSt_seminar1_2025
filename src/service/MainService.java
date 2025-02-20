package service;

import dataSt.MyList;
import java.util.Arrays;

public class MainService {
	public static void main(String[] args)  {
		MyList listForChar = new MyList(3);
		listForChar.add('a');
		listForChar.add('b');
		listForChar.add('c');
		listForChar.add('d');
		try
		{
			listForChar.printList();
			listForChar.add('Z', 1);
			listForChar.printList();
			
			listForChar.remove(0);
			listForChar.printList();
			
			listForChar.add('c');
			System.out.println(listForChar.getter(1));
			System.out.println(Arrays.toString(listForChar.search('c')));
			
			listForChar.sort();
			listForChar.printList();
			
			listForChar.makeEmpty();
			listForChar.printList();
			
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("ADD t ");
		listForChar.add('t');
		try
		{
			listForChar.printList();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		MyList<Integer> listForInt = new MyList<Integer>(3);
		listForInt.add(1);
		listForInt.add(4);
		listForInt.add(3);
		listForInt.add(7);
		try
		{
			listForInt.printList();
			listForInt.add(0, 1);
			listForInt.printList();
			
			listForInt.remove(0);
			listForInt.printList();
			
			listForInt.add(6);
			System.out.println(listForInt.getter(1));
			System.out.println(Arrays.toString(listForInt.search('c')));
			
			listForInt.sort();
			listForInt.printList();
			
			listForInt.makeEmpty();
			listForInt.printList();
			
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("ADD t ");
		listForInt.add(9);
		try
		{
			listForInt.printList();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
