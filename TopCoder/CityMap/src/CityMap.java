import java.util.*;

public class CityMap {
	public String getLegend(String[] cityMap, int[] POIs) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        for (String item : cityMap) {
            for (char c : item.toCharArray())
            {
                if (map.containsKey(c))
                    map.put(c, map.get(c) + 1);
                else
                    map.put(c, 1);
            }
        }

        StringBuffer result = new StringBuffer();
        for (int poi : POIs) {
            for (char c : map.keySet()) {
                if (c != '.' && map.get(c) == poi)
                    result.append(c);
            }
        }

        return result.toString();
	}
}
