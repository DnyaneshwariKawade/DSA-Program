package java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByKeysProgram {

	public static void main(String[] args) {
		
		Map<String, Integer> studentMap = new HashMap<String, Integer>();
        
        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);
        
        System.out.println("before:: "+studentMap);
        Map<Object, Object> sortedMap=  studentMap.entrySet()
        		.stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
       
        
        System.out.println("sortedMap:: "+sortedMap);
        		
        		
        Map<String, Integer> sortedStudentMap 
        = studentMap.entrySet()
                    .stream()
                    .sorted(Entry.comparingByKey())
                    .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        
        
        System.out.println("After:: "+sortedStudentMap);
        
        
        
        
	}
}
