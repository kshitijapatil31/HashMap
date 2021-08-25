package com.bridgelabz.hashmap;

public class HashMapRunner {

	public static void main(String args[]) {
		String string="to be or not to be";
		MyHashMap<String,Integer> myHashMap=new MyHashMap<>();
		String [] words=string.toLowerCase().split(" ");
		for(String word : words) {
			Integer value=myHashMap.get(word);
			if(value==null) {
				value=1;
			}else {
				value+=1;
				myHashMap.add(word,value);
			}
			int frequency=myHashMap.get("to");
			System.out.println(myHashMap);
			
		}
	}
}
