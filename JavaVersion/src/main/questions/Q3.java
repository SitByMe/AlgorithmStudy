package main.questions;

import main.utils.SoutUtils;

import java.util.*;

/**
 * Question：
 * 给定一本英语单词字典（每个输入行是一个由小写字母组成的单词），要求找出所有的变位词分类。
 */
public class Q3 {
    private static String[] words = new String[]{"pans", "pots", "opt", "snap", "stop", "tops"};

    /**
     * 使用基于排序的标识：将单词中的字母按照字母表顺序排列。
     * 1.新建一个辅助列表，用来保存每个单词对应的标识。
     * 2.将所有单词按照其标识的顺序排序。
     * end.如此之后，所有的变位词就全部挨着排在一起了。
     */
    public static void scheme1() {
        //1.
        Map<String, String> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            map.put(word, String.valueOf(chars));
        }
        //2.
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<>() {  //升序排序
            //升序排序
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        //end.
        for (Map.Entry<String, String> mapping : list) {
            SoutUtils.soutln(mapping.getKey() + " : " + mapping.getValue());
        }
    }
}
