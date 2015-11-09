
// Get the length of a list

object Length {
	def main(args: Array[String]) {
		println(length(List(1,2,3,4,5)))
	}
	def length(list: List[Any]) : Int = {
		return list.length
	}
}