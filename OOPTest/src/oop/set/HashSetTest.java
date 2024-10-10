package oop.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> set = Set.of("포도","수박","사과","키위","망고");
		HashSet<String> hashset = new HashSet<>(set);
		System.out.println(hashset);	
	}
}
