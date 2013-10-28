//暴力解法
def isPalindrome(num: Int) : Boolean = {
  var numStr = num.toString()

  numStr == numStr.reverse
}

var finalNum = (for (v1 <- (100 to 999);
                    v2 <- (100 to 999);
                    v3 = v1 * v2;
                    if isPalindrome(v3)) yield v3).max

println(finalNum)
    
