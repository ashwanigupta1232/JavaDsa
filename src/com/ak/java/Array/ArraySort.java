package com.ak.java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraySort {
	public static void main(String[] args) {

//		List<Integer> list2 =  new ArrayList<>();
//		
//		 list2.add(21);  
//		  list2.add(11);  
//		  list2.add(51);  
//		  list2.add(1); 
//		  
//	
//		 
//		 ArrayList<String> firstList=new ArrayList<String>(Arrays.asList("M", "W", "J", "K", "T"));  
//
//		 List<String> secondList=new ArrayList<String>(Arrays.asList("M", "W", "E", "K", "T"));  
//		 
//	}

		ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

		System.out.println("Common elemnts :" + l1.stream().filter(l2::contains).collect(Collectors.toList()));

	}

}
