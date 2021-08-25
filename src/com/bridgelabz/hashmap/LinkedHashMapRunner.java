package com.bridgelabz.hashmap;

public class LinkedHashMapRunner {

	public static void main(String[] args) {
		String string= "Paranoids are not paranoid because"
				+ "they are paranoid but because they keep"
				+"putting themselves deliberately into paranoid"
				+" avoidable situations";
		MyLinkedHashMap<String,Integer> myLinkedHashMap=new MyLinkedHashMap<>();
		String [] words=string.toLowerCase().split(" ");
		for(String word : words) {
			Integer value=myLinkedHashMap.get(word);
			if(value==null) {
				value=1;
			}else {
				value+=1;
				myLinkedHashMap.add(word,value);
			}
			System.out.println(myLinkedHashMap);
			int frequency=myLinkedHashMap.get("paranoid");
			
			
		}
	}

}
