package testPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class DuplicateCharsInString {

	public void findDuplicateChars(String str){
		
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
		char[] chrs = str.toCharArray();
		/*System.out.println(str.length());
		int i = chrs.length;
		System.out.println(i);*/
		for(Character ch:chrs){
			if(dupMap.containsKey(ch)){
				dupMap.put(ch, dupMap.get(ch)+1);
			} else {
				dupMap.put(ch, 1);
			}
		}
		
		System.out.println(dupMap);
		Set<Character> keys = dupMap.keySet();
		for(Character ch:keys){
			if(dupMap.get(ch) > 1){
				System.out.println(ch+"--->"+dupMap.get(ch));
			}
		}
	}
	
	public static void main(String a[]){
		DuplicateCharsInString dcs = new DuplicateCharsInString();
		dcs.findDuplicateChars("LajishLakshmanan");
	}
}