
// Eliminate duplicates in a list

class Compress {
	def main (args: Array[String]) {

	}
	def compress (list: List[Symbol]) : List[Symbol] = {
		var result: List[Symbol] = List()
		for (i <- 0 to list.length - 1) {
			if (list.indexOf(list(i)) >= i) {
				result = result :+ list(i)
			}
		}
		return result;
	}
}