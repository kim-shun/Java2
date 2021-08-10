package example;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
		Map<String, Integer> fruitsMap = new HashMap<>();
		
		fruitsMap.put("りんご", 100);
		fruitsMap.put("みかん", 150);
		fruitsMap.put("バナナ", 250);
		
		System.out.println(fruitsMap.get("りんご"));
		System.out.println(fruitsMap.get("みかん"));
		System.out.println(fruitsMap.get("バナナ"));

	}

}
