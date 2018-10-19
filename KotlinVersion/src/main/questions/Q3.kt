package main.questions

import main.utils.SoutUtils
import java.security.KeyStore
import java.util.*
import kotlin.collections.HashMap

/**
 * Question：
 * 给定一本英语单词字典（每个输入行是一个由小写字母组成的单词），要求找出所有的变位词分类。
 */
object Q3 {
    private var words: Array<String> = arrayOf("pans", "pots", "opt", "snap", "stop", "tops")

    /**
     * 使用基于排序的标识：将单词中的字母按照字母表顺序排列。
     * 1.新建一个辅助列表，用来保存每个单词对应的标识。
     * 2.将所有单词按照其标识的顺序排序。
     * end.如此之后，所有的变位词就全部挨着排在一起了。
     */
    fun scheme1() {
        //1.
        val map: HashMap<String, String> = hashMapOf()
        for (word in words) {
            val chars: CharArray = word.toCharArray()
            Arrays.sort(chars)
            map[word] = String(chars)
        }
        //2.
        val list: Array<MutableSet<MutableMap.MutableEntry<String, String>>> = arrayOf(map.entries)
        SoutUtils.sout(list.contentToString())
    }
}