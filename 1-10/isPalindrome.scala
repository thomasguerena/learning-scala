
// Report whether a list is a palindrome

object IsPalindrome {
	def main (args: Array[String]) {
		println("1,2,3,4,5 is a palindrome? " + isPalindrome(List(1,2,3,4,5)))
		println("1,2,3,2,1 is a palindrome? " + isPalindrome(List(1,2,3,2,1)))
		println("singleton is a palindrome? " + isPalindrome(List(5)))
	}
	def isPalindrome (nums: List[Any]) : Boolean = {
		var i = 0;
		var l = nums.length - 1;
		while (i < l - i) {
			if (nums(i) != nums(l - i)) return false
			i += 1
		}
		return true
	}
}