import scala.util.control.Breaks._

object AllDone extends Exception {}

var num = 0

try {
for (v1 <- (10 to 1000000000)) {
     if ((((1 to 20).map((Num) => v1 % Num)).sum) == 0) {
        num = v1
     }

     if (num != 0) {
       throw AllDone
     }
}
}
catch {
  case AllDone =>
    println(num)
}

