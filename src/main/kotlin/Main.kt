fun main(args: Array<String>) {
    println("Hello, world!")
    var sum = 0;
    args.forEach {
        sum += it.toInt()
    }
    println("Sum:  $sum")
}
