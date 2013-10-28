//object AllDone extends Exception {}
// 
//var num = 0
// 
//try {
//for (v1 <- (10 to 1000000000)) {
//     if ((((1 to 20).map((Num) => v1 % Num)).sum) == 0) {
//        num = v1
//     }
// 
//     if (num != 0) {
//       throw AllDone
//     }
//}
//}
//catch {
//  case AllDone =>
//    println(num)
//}

//这个是暴力解法，最快的解法应该是求他们的累计最小公倍数 1 2的最小公倍数，然后这个最小公倍数和3的最小公倍数，以此类推


def gcd(a:Int, b:Int) : Int = {
  if (b>0) 
    gcd(b, a%b)
  else
    a
}

def lcm(a:Int, b:Int): Int = {
  a / gcd(a,b) * b
}

def time(f: => Unit) = {
  val s = System.currentTimeMillis
  f
  System.currentTimeMillis - s
}

println(time { var num = (1 to 20).reduce {(a, b) => lcm(a, b)}

     println(num)
   })
