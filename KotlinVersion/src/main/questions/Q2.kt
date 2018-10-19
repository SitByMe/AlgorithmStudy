package main.questions

import main.utils.SoutUtils

/**
 * Question：
 * 将一个n元一维向量向左旋转。
 * 例如：当n=9且i=3时，向量abcdefgh旋转为defghabc。
 * 输入：abcdefgh，n=8且i=3。
 * 输出：defghabc。
 * 约束：仅有极少量的额外字节的存储空间。
 */
object Q2 {
    private var str: CharSequence = "abcdefgh"
    private var n: Int = str.length
    private var i: Int = 3

    fun scheme1() {
        SoutUtils.sout(str.toString())//abcdefg

        //置逆0至i位置的内容
        reverse(0, i)
        SoutUtils.sout(str.toString())//cbadefgh

        //置逆i至n位置的内容
        reverse(i, n)
        SoutUtils.sout(str.toString())//cbahgfed

        //置逆0只n位置的内容
        reverse(0, n)
        SoutUtils.sout(str.toString())//defghabc
    }

    /**
     * 置逆第startIndex至第endIndex个元素
     *
     * @param startIndex 起始元素坐标
     * @param endIndex   结束元素坐标
     */
    private fun reverse(startIndex: Int, endIndex: Int) {
        var frontSb: StringBuffer
        var backSb: StringBuffer
        if (startIndex == 0) {
            frontSb = StringBuffer(str.subSequence(0, endIndex))
            backSb = StringBuffer(str.subSequence(endIndex, str.length))
            //通过reverse()反转方法，反转；然后转换成字符串
            str = frontSb.reverse().append(backSb).toString()
        } else run {
            frontSb = StringBuffer(str.subSequence(0, startIndex))
            backSb = StringBuffer(str.subSequence(startIndex, str.length))
            //通过reverse()反转方法，反转；然后转换成字符串
            str = frontSb.append(backSb.reverse()).toString()
        }
    }
}