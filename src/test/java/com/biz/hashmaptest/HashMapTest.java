package com.biz.hashmaptest;

import com.biz.hashmap.HashMap;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HashMapTest {
@Test
    private void givenSentence_whenStringWords_shouldReturnCount() {
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");
        HashMap<String, Integer> hashMap = new HashMap();
        for (String word : words) {
            Integer value = hashMap.get(word);
            if (value==null){
                value=1;
            }else{
                value+=1;
            }
            hashMap.add(word,value);
        }
       int actualResult= hashMap.get("be");
        int expectedResult=2;
        Assert.assertEquals(expectedResult,actualResult);
    }

}
