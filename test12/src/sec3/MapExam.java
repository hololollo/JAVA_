package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

// Map : key, value로 이루어져 있다.
public class MapExam {

	public static void main(String[] args) {
		//Map은 List처럼 index가 없어서 순서가 없다.
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();
		
		
		//HashMap
		map1.put("kim", 90); // put(key, value) : 추가
		map1.put("lee", 100); 
		map1.put("park", 80); 
		map1.put("kang", 100); 
		map1.put("kwon", 90); 
		System.out.println(map1); // toString
		
		
		//개별요소 접근
		//방법 1(key)
		System.out.println("park : " + map1.get("park")); // get(index)가 아닌 get(key)
		//개별요소 접근시 인덱스가 아니라 key값으로 접근
		
		//방법 2(key)
		if(map1.containsKey("kang")) { // 특정 key의 존재유무 확인
			System.out.println("kang : " + map1.get("kang"))  ;
		}else {
			System.out.println("키가 kang인 요소는 존재하지 않습니다.");
		}
		
		//방법 3(value)
		if(map1.containsValue(100)) { // 특정 value의 존재유무 확인
			System.out.println("만점자가 존재합니다.");
		}else {
			System.out.println("만점자가 없습니다.");
		}
		
		
		//Hashtable
		map2.put("김", "1코스"); // put : 값 저장
		map2.put("이", "2코스"); 
		map2.put("박", "3코스"); 
		map2.put("김", "2코스"); // ★key : 중복 불가능★
		map2.put("이", "3코스"); // ★key : 중복 불가능★
		map2.put("최", "1코스"); 
		System.out.println(map2); // value : 중복 가능, key값이 중복이라면 마지막에 입력된 값이 해당 값이 된다(java특징)
	}

}
