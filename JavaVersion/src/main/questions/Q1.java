package main.questions;

import main.utils.SoutUtils;

import java.util.Arrays;

/**
 * Question：
 * 输入：一个最多包含x个正整数的文件，每个数都小于n，其中n=107。如果在输入文件中有任何整数重复出现就是致命错误。没有其他数据与该整数相关联。
 * 输出：按升序排列的输入整数的列表。
 * 约束：最多有（大约）1MB的内存空间可用，有充足的磁盘存储空间可用。运行时间最多几分钟，运行时间为10秒就不需要进一步优化了。
 */
public class Q1 {
    // x=50000, n=100000
    private static int valueMaxCount = 100000;
    private static int valueCount = 50000;
    private static int[] values = new int[valueCount];

    /**
     * 初始化数据
     */
    public static void initData() {
        for (int i = 0; i < values.length; ) {
            int roundNum = (int) (Math.random() * (valueMaxCount - 1) + 1);
            boolean has = false;
            for (int num : values) {
                if (num == roundNum) {
                    has = true;
                    break;
                }
            }
            if (!has) {
                values[i++] = roundNum;
            }
        }
        SoutUtils.soutln(Arrays.toString(values).concat(" ---原始数据"));
        SoutUtils.soutln(String.valueOf(values.length));
    }

    /**
     * 最大排序的数据中的最大值为maxValue，则创建一个长度为maxValue的byte数组，所有元素的初始值均为0，
     * 每存在一个value，则将byte数组中对应的byte[value]的值置为1，
     * 最后，遍历byte数组，以此输出值为1的元素的index即可。
     */
    public static void scheme1() {
        byte[] valueIndexes = new byte[valueMaxCount];
        for (int value : values) {
            valueIndexes[value] = 1;
        }
        SoutUtils.soutln(Arrays.toString(valueIndexes).concat(" ---将数据放在坐标上"));
        for (int i = 0; i < valueIndexes.length; i++) {
            if (valueIndexes[i] == 1)
                SoutUtils.sout(String.valueOf(i).concat(", "));
        }
        SoutUtils.soutln(" ---所有存在值的坐标点（即所有的值）");
    }
}
