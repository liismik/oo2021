package Homework;
import java.util.*;
import java.util.HashMap;
import org.javatuples.KeyValue;

public class HomeworkII {
    public static void main(String[] args){
        System.out.println(CharToMap("Bibibibabahello"));
    }

    public static HashMap<String, Integer> CharToMap(String sõna) {
        HashMap<String, Integer> charMap = new HashMap<String, Integer>();
        char[] charArray = sõna.toCharArray();
        for (char charact : charArray){
            System.out.println(charact);
            if(charMap.containsKey(String.valueOf(charact).toUpperCase())){
                Integer a = charMap.get(String.valueOf(charact).toUpperCase());
                charMap.put(String.valueOf(charact).toUpperCase(), a+1);
            } else if(!charMap.containsKey(String.valueOf(charact).toUpperCase())){
                charMap.put(String.valueOf(charact).toUpperCase(), 1);
            }
        }
        return charMap;
    }
}
