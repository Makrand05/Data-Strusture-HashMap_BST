package com.biz.hashmaptest;

import com.biz.hashmap.HashMap;
import com.biz.hashmap.HashMapParagraph;
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
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMap.add(word, value);
        }
        int actualResult = hashMap.get("be");
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }
@Test
    private void givenParagraph_whenStringPara_shouldReturnCount() {
        String para = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = para.toLowerCase().split(" ");
        HashMapParagraph hashMapParagraph = new HashMapParagraph<>();
        for (String word : words) {
            Integer value = (Integer) hashMapParagraph.get(word);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMapParagraph.add(word, value);
        }
        int actualResult = (int) hashMapParagraph.get("paranoid");
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
