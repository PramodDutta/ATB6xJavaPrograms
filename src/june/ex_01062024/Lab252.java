package src.june.ex_01062024;

import java.util.Map;
import java.util.HashMap;

public class Lab252 {
    public static void main(String[] args) {
        // Map - key value pair
        // API Testing - JSON - JavaScript Object Notation - Map
        // JSON - key value pair
        // HashSet and HastMap
        // name - pramod, age - 65, roll - 1, course -atb
        Map<String, Object> studentMap = new HashMap();
//        studentMap.put("firstname", "Pramod");
        studentMap.put("firstname", "Amit");
        studentMap.put("age", 65);
        studentMap.put("roll", 1);
        studentMap.put("course", "ATB");
        studentMap.put("lastname", "Dutta");
        studentMap.put("isMale", true);
        System.out.println(studentMap);
        System.out.println(studentMap.get("firstname"));
        System.out.println(studentMap.get("age"));
        System.out.println(studentMap.isEmpty());
        System.out.println(studentMap.containsKey("age"));
        System.out.println(studentMap.containsValue(65));
        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());

        for(Map.Entry<String,Object> item: studentMap.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }




    }
}
