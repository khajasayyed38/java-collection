package com.java.collections.interfaces.map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {
    public static void main(String[] args) {
        Map<String, Integer> map= new HashMap<>();
       map.put("khaja",101);
       map.put("pavan",102);
       map.put("vijay",103);
       map.put("venkatesh",104);
//       for(Map.Entry<String,Integer>m:map.entrySet()){
//           System.out.println(m.getKey());
//           System.out.println(m.getValue());
//       }
//       map.forEach((k,v)-> System.out.println(k+" "+v));
        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Integer> values = map.values();
        System.out.println(values);
    }
}
