fun main() {
    val hello = readln()
    println("${hello.last()}${hello.slice(1..hello.lastIndex - 1)}${hello.first()}")
    hello.substring(6)
   println("content".substring(0, 0))

    println("content".substring(0,1))

    println("content".substringBefore("c"))

    println("content".substring(1,1))
//
//    println("content".substringAfter("t"))
//
//    println("content".substring(-1,-1))
}