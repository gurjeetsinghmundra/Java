package learnCollection_2;

import java.util.TreeMap;

public class MapExample4 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(101, "A");
		map.put(102, "B");
		map.put(209, "C");
		map.put(211, "D");
		map.put(500, "E");
		map.put(501, "F");
		map.put(503, "G");
		
		
		System.out.println(map);
		
		System.out.println("-----------------------------------------");
		
		System.out.println(map.keySet());
		System.out.println(map.higherKey(102));//value greater than 102
		System.out.println(map.higherEntry(102));
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println(map.lowerKey(211));
		System.out.println(map.lowerEntry(501));
		
		System.out.println("-----------------------------------------");
		
		System.out.println(map.ceilingKey(504));//if value is present than it will return that value or if not than it  will give bigger value
		System.out.println(map.ceilingEntry(102));
		
		System.out.println("-----------------------------------------");
		
		System.out.println(map.floorKey(504));//if value is present than it will return that value or if not than it  will give smaller value
		System.out.println(map.floorEntry(210));
		
		System.out.println("-----------------------------------------");
		
		System.out.println(map.headMap(211));//value ahead of 211
		//return value will be map
		System.out.println(map.headMap(211, true));// to include 211 also
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println(map.tailMap(209)); //value behind of 209 (209 will be included)
		//this will also return map
		System.out.println(map.tailMap(209, false));//to  exclude 209
		
		System.out.println("-----------------------------------------");
		
		System.out.println(map.subMap(102, 500)); //submap works as range
		//in above 102 will be inclusive but 500 will be exclusive
		
		System.out.println(map.subMap(102,true, 500,true));// 4 arguments are allowed(cant take 3)
		// to inclued 500
		
		System.out.println("-----------------------------------------");
		System.out.println(map.firstEntry()); 
		System.out.println(map.firstKey());
		System.out.println(map.lastEntry());
		System.out.println(map.lastKey());
		
		System.out.println("-----------------------------------------");
		
		System.out.println(map.pollFirstEntry());//remove first entry
		System.out.println(map.pollLastEntry());//remove last entry
		System.out.println(map);
		
	}
}


