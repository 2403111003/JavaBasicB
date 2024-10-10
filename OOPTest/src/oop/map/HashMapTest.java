package oop.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
		HashMap<String, Integer> hashmap = new HashMap<>(map);
	}
}
