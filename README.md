# Learning Scala
### Currently listing the first 20 of 99 practice problems.
The full list: <http://aperiodic.net/phil/scala/s-99/>

1. [x] &nbsp;&nbsp;&nbsp;Find the last element of a list.

        last(List(1, 1, 2, 3, 5, 8))
        res0: Int = 8
2. [x] &nbsp;&nbsp;&nbsp;Find the last but one element of a list.

    	penultimate(List(1, 1, 2, 3, 5, 8))
    	res0: Int = 5
3. [x] &nbsp;&nbsp;&nbsp;Find the Kth element of a list.&nbsp;&nbsp;&nbsp;*By convention, the first element in the list is element 0.*

    	nth(2, List(1, 1, 2, 3, 5, 8))
    	res0: Int = 2
4. [x] &nbsp;&nbsp;&nbsp;Find the number of elements of a list.

    	length(List(1, 1, 2, 3, 5, 8))
    	res0: Int = 6
5. [x] &nbsp;&nbsp;&nbsp;Reverse a list.

    	reverse(List(1, 1, 2, 3, 5, 8))
    	res0: List[Int] = List(8, 5, 3, 2, 1, 1)
6. [x] &nbsp;&nbsp;&nbsp;Find out whether a list is a palindrome.

    	isPalindrome(List(1, 2, 3, 2, 1))
    	res0: Boolean = true
7. [x] &nbsp;&nbsp;&nbsp;Flatten a nested list structure.

    	flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    	res0: List[Any] = List(1, 1, 2, 3, 5, 8)
8. [x] &nbsp;&nbsp;&nbsp;Eliminate consecutive duplicates of list elements.&nbsp;&nbsp;&nbsp;*If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.*

    	compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    	res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
9. [x] &nbsp;&nbsp;&nbsp;Pack consecutive duplicates of list elements into sublists.
&nbsp;&nbsp;&nbsp;*If a list contains repeated elements they should be placed in separate sublists.*

    	pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    	res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
10. [x] &nbsp;&nbsp;&nbsp;Run-length encoding of a list.&nbsp;&nbsp;&nbsp;*Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.*

    	encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    	res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
11. [ ] &nbsp;&nbsp;&nbsp;Modified run-length encoding.&nbsp;&nbsp;&nbsp;*Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.*

    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
12. [ ] &nbsp;&nbsp;&nbsp;Decode a run-length encoded list.&nbsp;&nbsp;&nbsp;*Given a run-length code list generated as specified in problem P10, construct its uncompressed version.*

    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
13. [ ] &nbsp;&nbsp;&nbsp;Run-length encoding of a list (direct solution).&nbsp;&nbsp;&nbsp;*Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.*

    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
14. [ ] &nbsp;&nbsp;&nbsp;Duplicate the elements of a list.

    duplicate(List('a, 'b, 'c, 'c, 'd))
    List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
15. [ ] &nbsp;&nbsp;&nbsp;Duplicate the elements of a list a given number of times.

    duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
16. [ ] &nbsp;&nbsp;&nbsp;Drop every Nth element from a list.

    drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
17. [ ] &nbsp;&nbsp;&nbsp;Split a list into two parts.

    split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
18. [ ] &nbsp;&nbsp;&nbsp;Extract a slice from a list.&nbsp;&nbsp;&nbsp;*Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.*

    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    List[Symbol] = List('d, 'e, 'f, 'g)
19. [ ] &nbsp;&nbsp;&nbsp;Rotate a list N places to the left.

    rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

    rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
20. [ ] &nbsp;&nbsp;&nbsp;Remove the Kth element from a list.&nbsp;&nbsp;&nbsp;*Return the list and the removed element in a Tuple. Elements are numbered from 0.*

    removeAt(1, List('a, 'b, 'c, 'd))
    (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)