
// Get the last element in a list

object Last {
	def main(args: Array[String]) {
		println(last(List(1,2,3,4,5)))
	}
	def last(list: List[Any]) : Any = {
		return list.last
	}
}