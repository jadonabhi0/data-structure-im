package HashMap;

import com.sun.jdi.event.StepEvent;

import java.util.*;

public class HashMapIntro {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);

        // iterate over map
//        Set<String> set = map.keySet();
//        for (String i : set){
//            System.out.println(i+"->"+map.get(i));
//        }

        for (Map.Entry<String, Integer> m : map.entrySet()){
            System.out.println(m.getKey()+" -> "+m.getValue());
        }


        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("one",1);
        map1.put("two",2);
        map1.put("three",3);
        map1.put("four",4);
        map1.put("five",5);
        map1.put("six",6);
        map1.put("seven",7);
//        System.out.println(map1);

        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
//        map2.put("one",1);
//        map2.put("two",2);
//        map2.put("three",3);
//        map2.put("four",4);
//        map2.put("five",5);
//        map2.put("six",6);
//        map2.put("seven",7);
//        System.out.println(map2);


    }


}
