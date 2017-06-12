/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 		|_MelonGenreChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author : persi
 * @version : 1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("맞지?","언니쓰"));
		
		Map<String, List<Music>> map = new HashMap<>();
		map.put("댄스",list);
		
		List<Music> list2 = new ArrayList<Music>();
		list2.add(new Music("팔레트", "아이유"));
		
		map.put("발라드",list2);
		
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
		System.out.println();
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		list.set(1, new Music("SIGNAL","트와이스"));
		printMap(map);
		System.out.println();
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		list.remove(0);
		printMap(map);
		System.out.println();
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.clear();
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			for(int i = 0; i< map.get(key).size(); i++){
				System.out.println(i+1 + "." + map.get(key).get(i));
			}
		}
	}

}
