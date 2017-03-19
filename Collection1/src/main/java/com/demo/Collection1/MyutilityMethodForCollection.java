package com.demo.Collection1;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

/**
 * @author Progvaltion_11
 */
public class MyutilityMethodForCollection {


	/**
	 * @author Progvaltion_11
	 * @param collection
	 */
	public static void traverseUsingIterator(Collection collection) {
		System.out.println("###############Inside traverseUsingIterator###############");
		if(checkFornull(collection))
			return;
		Iterator itr = collection.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	private static boolean checkFornull(Collection collection) {
		try{
			if(null==collection)
				throw new NullPointerException("Null disat nahi ka re");
		}catch (Exception e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}

	/**
	 * @author Progvaltion_11
	 * @param list
	 */
	public static void traverseUsingListIterator(List list) {
		System.out.println("###############traverseUsingListIterator###############");
		if(checkFornull(list))
			return;
		ListIterator itr = list.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	
	/**
	 * @author Progvaltion_11
	 * @param collection
	 */
	public static void traverseUsingEnumeration(Collection collection) {
		//Collection collection1 = new Vector();
		Enumeration enumratr =null;
		if(checkFornull(collection))
			return;
		System.out.println("###############Inside traverseUsingEnumeration###############");
		if(collection instanceof Vector){
			Vector vector= (Vector)collection;
			enumrateColletion(vector);
		}		
		else if(collection instanceof Stack){
			Stack stack= (Stack)collection;
			enumrateColletion(stack);
		}else if (collection instanceof Hashtable || collection instanceof Properties || collection instanceof Dictionary){
			//Will Implement later
		} else
			try {
				throw new InvalideCollectionTypeForEnumaration("vyavstit pas kara re");
			} catch (InvalideCollectionTypeForEnumaration e) {
				e.printStackTrace();
			}
		
	}

	private static void enumrateColletion(Vector vector) {
		System.out.println(" Inside enumrateColletion");
		Enumeration enumrate =vector.elements();
		while(enumrate.hasMoreElements()){
			System.out.println(enumrate.nextElement());
		}

	}

}
