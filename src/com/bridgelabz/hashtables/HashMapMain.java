package com.bridgelabz.hashtables;

public class HashMapMain {

	public static void main(String[] args) {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = hashMap.get(word);
			if(value == null) {
				value = 1;
			}
			else {
				value += 1;
			}
			hashMap.add(word, value);
		}
		int frequency = hashMap.get("avoidable");
		System.out.println(frequency);
		frequency = hashMap.get("avoidable");
		System.out.println(frequency);
		hashMap.remove("avoidable");
	}
}