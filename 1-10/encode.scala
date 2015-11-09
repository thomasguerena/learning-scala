
// Run-length encoding of a list (pairs containing an item and the number of
//   consecutive occurrences of that item in the list).

import collection.mutable.ListBuffer

object Encode {
	def main (args: Array[String]) {
		println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
	}

	def encode (list: List[Symbol]) : List[(Int, Symbol)] = {
		var packed: List[List[Symbol]] = pack(list)
		var encoded: List[(Int, Symbol)] = List()
		for (i <- 0 to (packed.length - 1)) {
			val tuple = (packed(i).length, packed(i)(0))
			encoded = encoded :+ tuple
		}
		return encoded
	}

	// From pack.scala - packs consecutive similar symbols
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