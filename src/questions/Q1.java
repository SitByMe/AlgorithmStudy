package questions;

import java.util.Arrays;

/**
 * 输入：一个最多包含n个正整数的文件，每个数都小于n，其中n=107。如果在输入文件中有任何整数重复出现就是致命错误。没有其他数据与该整数相关联。
 * 输出：按升序排列的输入整数的列表。
 * 约束：最多有（大约）1MB的内存空间可用，有充足的磁盘存储空间可用。运行时间最多几分钟，运行时间为10秒就不需要进一步优化了。
 */
public class Q1 {
    private static int n = 107;
    private static int[] values = new int[]{1, 3, 5, 6, 77, 106, 33, 36, 64, 73};

    public static void main(String[] args) {
        scheme1();
    }

    public static void scheme1() {
        byte[] bytes = new byte[n];
        for (byte b : bytes) {
            b = 0;
        }
        for (int value : values) {
            bytes[value] = 1;
        }
        System.out.println(Arrays.toString(bytes));
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 1)
                System.out.println(i);
        }
    }

    public void scheme2() {

    }

    public void scheme3() {

    }

    public void scheme4() {

    }
}
