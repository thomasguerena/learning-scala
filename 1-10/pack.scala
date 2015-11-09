
// Create list of lists, grouping consecutive similar symbols

import collection.mutable.ListBuffer

object Pack {
	def main (args: Array[String]) {
		println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
	}

	// Packs consecutive similar symbols
	def pack (list: List[Symbol]) : List[List[Symbol]] = {
		var result: ListBuffer[List[Symbol]] = ListBuffer(List(list(0)))

		for (i <- 1 to (list.length - 1)) {
			if (list(i) == list(i - 1)) {
				result(result.length - 1) = list(i) +: result(result.length - 1)
			} else {
				result = result :+ List(list(i))
			}
		}

		return result.toList
	}
}