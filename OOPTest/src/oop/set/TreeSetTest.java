package oop.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		Set<String> set = Set.of("포도","수박","사과","키위","망고");
		TreeSet<String> treeset = new TreeSet<>(set);
		System.out.println(treeset);
	}
}
