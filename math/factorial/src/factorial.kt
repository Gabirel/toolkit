import java.math.BigInteger

//默认传值：1
class Result(var value: BigInteger = BigInteger.valueOf(1L))

//采用尾递归方式
tailrec fun factorial(num: Int, result: Result) {
	if (num == 0) result.value = result.value.times(BigInteger.valueOf(1L))
	else {
		result.value = result.value.times(BigInteger.valueOf(num.toLong()))
		factorial(num - 1, result)
	}
}

fun main(args: Array<String>) {
	val _PROGRAM_INFO = """
********************************************
*               Factorial                  *
*                                          *
*  Gabriel: wqq977sz@163.com               *
*  https://github.com/Gabirel              *
*                             2017/05/20   *
*                                          *
********************************************
"""
	println(_PROGRAM_INFO)
	val result = Result()
	if (args.size == 0) {
		println("Please add an parameter!!")
	} else {
		println("${args[0].toInt()}! =")
		factorial(args[0].toInt(), result)
		println(result.value)
	}
}
