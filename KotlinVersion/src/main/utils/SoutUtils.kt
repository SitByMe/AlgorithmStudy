package main.utils

object SoutUtils {
    private const val tag: String = "Kotlin --- "

    /**
     * 打印内容（默认带tag，并且换行）
     * @param content 内容
     */
    fun sout(content: Any) {
        sout(content, true)
    }

    /**
     * 打印内容
     * @param content 内容
     * @param withTag 是否包含tag
     */
    private fun sout(content: Any, withTag: Boolean) {
        when (content) {
            is Map<*, *> -> soutMap(content)
            else -> {
                val builder = StringBuilder(content.toString())
                if (withTag) builder.insert(0, tag)
                println(builder.toString())
            }
        }
    }

    /**
     * 打印map
     * @param map map数据
     */
    private fun soutMap(map: Map<*, *>) {
        val builder = StringBuilder()
        for ((k, v) in map) {
            builder.append("\n").append(k.toString()).append(":").append(v.toString())
        }
        println("$tag$builder")
    }
}