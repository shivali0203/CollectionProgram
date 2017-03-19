package com.demo.Collection1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	ArrayList<String> mylist = new ArrayList<>();
    	mylist.add("A1");
    	mylist.add("A2");
    	mylist.add("A3");
    	mylist.add("A4");
    	mylist.add("A5");
    	mylist.add("A6");
 
    	LinkedList<String> mylinkedlist = new LinkedList<>();
    	mylinkedlist.add("B1");
    	mylinkedlist.add("B2");
    	mylinkedlist.add("B3");
    	mylinkedlist.add("B4");
    	mylinkedlist.add("B5");
    	mylinkedlist.add("B6");
 
    	Vector vector = new Vector<>();
    	vector.add("V1");
    	vector.add("V2");
    	vector.add("V3");
    	vector.add("V4");
    	vector.add("V5");
    	
    	Stack stack = new Stack<>();
    	stack.add("S0");
    	stack.addAll(vector);
    	stack.add("S1");
    	
    	System.out.println("###################Check for NULL##################");
    	MyutilityMethodForCollection.traverseUsingIterator(null);
    	MyutilityMethodForCollection.traverseUsingListIterator(null);
    	MyutilityMethodForCollection.traverseUsingEnumeration(null);
    	
    	
    	System.out.println("################### Using Iterator Cursors ##################");
    	MyutilityMethodForCollection.traverseUsingIterator(mylist);
    	MyutilityMethodForCollection.traverseUsingIterator(mylinkedlist);
    	MyutilityMethodForCollection.traverseUsingIterator(vector);
    	MyutilityMethodForCollection.traverseUsingIterator(stack);
    	
    	System.out.println("################### Using ListIterator Cursors ##################");
    	MyutilityMethodForCollection.traverseUsingListIterator(mylist);
    	MyutilityMethodForCollection.traverseUsingListIterator(mylinkedlist);
    	MyutilityMethodForCollection.traverseUsingListIterator(vector);
    	MyutilityMethodForCollection.traverseUsingListIterator(stack);
  
    	
    	System.out.println("################### Using Enumaration Cursors ##################");
    	MyutilityMethodForCollection.traverseUsingEnumeration(mylist);
    	MyutilityMethodForCollection.traverseUsingEnumeration(mylinkedlist);
    	MyutilityMethodForCollection.traverseUsingEnumeration(vector);
    	MyutilityMethodForCollection.traverseUsingEnumeration(stack);
  
    }
  }