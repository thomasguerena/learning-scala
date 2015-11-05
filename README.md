# Learning Scala
### Currently listing the first 10 of 99 practice problems.
The full list: <http://aperiodic.net/phil/scala/s-99/>

1. [ ] &nbsp;&nbsp;&nbsp;Find the last element of a list.

        last(List(1, 1, 2, 3, 5, 8))
        res0: Int = 8
2. [ ] &nbsp;&nbsp;&nbsp;Find the last but one element of a list.

    	penultimate(List(1, 1, 2, 3, 5, 8))
    	res0: Int = 5
3. [ ] &nbsp;&nbsp;&nbsp;Find the Kth element of a list.&nbsp;&nbsp;&nbsp;*By convention, the first element in the list is element 0.*

    	nth(2, List(1, 1, 2, 3, 5, 8))
    	res0: Int = 2
4. [ ] &nbsp;&nbsp;&nbsp;Find the number of elements of a list.

    	length(List(1, 1, 2, 3, 5, 8))
    	res0: Int = 6
5. [ ] &nbsp;&nbsp;&nbsp;Reverse a list.

    	reverse(List(1, 1, 2, 3, 5, 8))
    	res0: List[Int] = List(8, 5, 3, 2, 1, 1)
6. [ ] &nbsp;&nbsp;&nbsp;Find out whether a list is a palindrome.

    	isPalindrome(List(1, 2, 3, 2, 1))
    	res0: Boolean = true
7. [ ] &nbsp;&nbsp;&nbsp;Flatten a nested list structure.

    	flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    	res0: List[Any] = List(1, 1, 2, 3, 5, 8)
8. [ ] &nbsp;&nbsp;&nbsp;Eliminate consecutive duplicates of list elements.&nbsp;&nbsp;&nbsp;*If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.*

    	compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    	res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
9. [ ] &nbsp;&nbsp;&nbsp;Pack consecutive duplicates of list elements into sublists.
&nbsp;&nbsp;&nbsp;*If a list contains repeated elements they should be placed in separate sublists.*

    	pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    	res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
10. [ ] &nbsp;&nbsp;&nbsp;Run-length encoding of a list.&nbsp;&nbsp;&nbsp;*Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.*

    	encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    	res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))