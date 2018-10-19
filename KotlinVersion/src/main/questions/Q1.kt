package main.questions

import main.utils.SoutUtils

/**
 * Question：
 * 输入：一个最多包含x个正整数的文件，每个数都小于n，其中n=107。如果在输入文件中有任何整数重复出现就是致命错误。没有其他数据与该整数相关联。
 * 输出：按升序排列的输入整数的列表。
 * 约束：最多有（大约）1MB的内存空间可用，有充足的磁盘存储空间可用。运行时间最多几分钟，运行时间为10秒就不需要进一步优化了。
 */
object Q1 {
    var valueMaxCount: Int = 100000
    var valueCount: Int = 50000
    var values: IntArray = IntArray(valueCount)

    /**
     * 初始化数据
     */
    fun initData() {
        var i = 0
        while (i < values.size) {
            val roundNum: Int = (Math.random() * (valueMaxCount - 1) + 1).toInt()
            var has = false
            for (num in values) {
                if (num == roundNum) {
                    has = true
                    break
                }
            }
            if (!has) {
                values[i++] = roundNum
            }
        }
        SoutUtils.sout(values.contentToString())
        SoutUtils.sout(values.size.toString())
    }

    /**
     * 最大排序的数据中的最大值为maxValue，则创建一个长度为maxValue的byte数组，所有元素的初始值均为0，
     * 每存在一个value，则将byte数组中对应的byte[value]的值置为1，
     * 最后，遍历byte数组，以此输出值为1的元素的index即可。
     */
    fun scheme1() {
        val valueIndexes = ByteArray(valueMaxCount)
        for (value in values) {
            valueIndexes[value] = 1
        }
        SoutUtils.sout(valueIndexes.contentToString() + " ---将数据放在坐标上")
        val builder = StringBuilder()
        for (i in valueIndexes) {
            if (i.toInt() == 1) {
                builder.append("$i, ")
            }
        }
        SoutUtils.sout("$builder ---所有存在值的坐标点（即所有的值）")
    }
}