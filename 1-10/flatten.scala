
// Flatten nested lists in atomic elements

object Flatten {
	def main (args: Array[String]) {
		println(flatten(List(List(1,2), 3, List(List(4), List(5)))))
	}
	def flatten (list: List[Any]) : List[Any] = list.flatMap {
		case l: List[Any] => flatten(l)
		case otherwise => List(otherwise)
	}
}