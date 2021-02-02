package exam;
/*
 
2.Write a program to sort a Treemap in reverse order using comparator.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import java.util.*; 

public class Ex2 { 
    public static void main(String args[]) 
    { 
        // Map to store the elements 
        Map<String, String> treemap =  
               new TreeMap<String, String>(Collections.reverseOrder()); 
  
        // Put elements to the map 
        treemap.put("1", "Welcome"); 
        treemap.put("2", "to"); 
        treemap.put("3", "the"); 
        treemap.put("4", "Geeks"); 
        treemap.put("5", "Community"); 
  
      //use map.entrySet() for iterating the map
      		// map.entrySet() -> return entry objects.
      		//every entry obj has key and value 
      		for (Entry<String, String> entry : treemap.entrySet()) {
      			String key = entry.getKey();
      			String value = entry.getValue();
      			System.out.println("key === " + key + "  value ==" + value);
      	}

    } 
} 