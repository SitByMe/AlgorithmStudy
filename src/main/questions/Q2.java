package main.questions;

/**
 * Question：
 * 将一个n元一维向量向左旋转。
 * 例如：当n=9且i=3时，向量abcdefgh旋转为defghabc。
 * 输入：abcdefgh，n=8且i=3。
 * 输出：defghabc。
 * 约束：仅有极少量的额外字节的存储空间。
 */
public class Q2 {
    private static CharSequence str = "abcdefgh";
    private static int n = str.length();
    private static int i = 3;

    public static void scheme1() {
        System.out.println(str);//abcdefgh

        //置逆0至i位置的内容
        reverse(0, i);
        System.out.println(str);//cbadefgh

        //置逆i至n位置的内容
        reverse(i, n);
        System.out.println(str);//cbahgfed

        //置逆0只n位置的内容
        reverse(0, n);
        System.out.println(str);//defghabc
    }

    /**
     * 置逆第startIndex至第endIndex个元素
     *
     * @param startIndex 起始元素坐标
     * @param endIndex   结束元素坐标
     */
    private static void reverse(int startIndex, int endIndex) {
        StringBuffer frontSb;
        StringBuffer backSb;
        if (startIndex == 0) {
            frontSb = new StringBuffer(str.subSequence(0, endIndex));
            backSb = new StringBuffer(str.subSequence(endIndex, str.length()));
            //通过reverse()反转方法，反转；然后转换成字符串
            str = frontSb.reverse().append(backSb).toString();
        } else {
            frontSb = new StringBuffer(str.subSequence(0, startIndex));
            backSb = new StringBuffer(str.subSequence(startIndex, str.length()));
            //通过reverse()反转方法，反转；然后转换成字符串
            str = frontSb.append(backSb.reverse()).toString();
        }
    }
}
