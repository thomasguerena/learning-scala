
// Get the "nth" item from a list

object Nth {
	def main (args: Array[String]) {
		println(nth(2, List(1,2,3,4,5)))
	}
	def nth (i: Int, list: List[Any]) : Any = {
		return list(i)
	}
}