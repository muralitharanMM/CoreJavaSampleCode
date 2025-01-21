package com.murali.outofmem;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * -Xmx10m
 * This option sets the maximum heap size for the JVM to 100 megabytes (MB). 
 * The heap is the area of memory used by the Java application to store objects. 
 * By specifying -Xmx100m, you're telling the JVM not to exceed 100MB for the heap. 
 * -XX:+UseParallelGC
 * This option enables the Parallel Garbage Collector, 
 * which uses multiple threads to perform garbage collection.
 *  This can help improve performance by utilizing multiple CPU cores, 
 * particularly for applications that have a large amount of data to process
 * */
public class OutOfMemory_GC_overhead_limit_exceeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		//m = System.getProperties();
		Random r = new Random();
		while(true) {
			m.put(new Integer(r.nextInt()), "random");
		}
	}

}
