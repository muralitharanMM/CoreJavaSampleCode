package com.murali.outofmem;

import java.util.ArrayList;
import java.util.List;


/* to throw java.lang.OutOfMemoryError: Java heap space
 * 
 * consuming a lot of Java heap space, 
 * and when the leaked memory fills all of the 
 * available memory in the heap region and Garbage
 *  Collection is not able to clean it,
 *  the java.lang.OutOfMemoryError:Java heap space is thrown.
 */
public class OutOfMemory_HeapSpace {
	static List<String> list = new ArrayList<String>(); 
	  
    public static void main(String args[]) throws Exception 
    { 
        Integer[] array = new Integer[100000 * 100000]; 
        System.out.println("asdf");
    } 
}

