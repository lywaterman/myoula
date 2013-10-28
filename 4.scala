//暴力解法
var l1 = (100 to 999).toList
var l2 = (100 to 999).toList

var l3 = for (v1 <- l1; v2 <- l2) yield v1 * v2

def isPalindrome(num: Int) : Boolean = {
  var numStr = num.toString()
  var numStrLen = numStr.length

  if (numStrLen % 2 == 0) {
    var count = numStrLen / 2
    var dropStr = numStr.drop(count)
    var dropRStr = numStr.dropRight(count)

    dropStr == dropRStr.reverse

  } else {
    var count = (numStrLen / 2).toInt
    
    var dropStr = numStr.drop(count)
    var dropRStr = numStr.dropRight(count)

    dropStr == dropRStr.reverse
  }
}

var Palindromes = for (v3 <- l3; if isPalindrome(v3)) yield v3 

Palindromes = Palindromes.sorted

println(Palindromes(Palindromes.size - 1))
    
