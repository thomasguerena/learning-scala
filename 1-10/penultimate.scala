
// Get the second-to-last item from a list

object Penultimate {
	def main (args: Array[String]) {
		println(penultimate(List(1,2,3,4,5)))
	}
	def penultimate (list: List[Any]) : Any = {
		return list(list.length - 2);
	}
}