
// Reverse the order of items in a list

object Reverse {
	def main (args: Array[String]) {
		println(reverse(List(1,2,3,4,5)))
	}
	def reverse (list: List[Any]) : List[Any] = {
		return list.reverse
	}
}