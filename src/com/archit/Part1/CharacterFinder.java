package com.archit.Part1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterFinder {
    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (var ch: str.toCharArray()){
            if(map.containsKey(ch)){
                var count = map.get(ch);
                map.put(ch,count+1);
            }else
                map.put(ch,1);
        }
        System.out.println(map);


        for(var ch: str.toCharArray())
            if (map.get(ch) == 1)
                return ch;
        return Character.MIN_VALUE;
    }

    public char findFirstRepeatedCharacter(String str){
        Set<Character> set = new HashSet<>();
        for(var ch: str.toCharArray()){
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
