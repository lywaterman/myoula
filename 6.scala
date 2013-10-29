import math._; 
var result = pow(((1 to 100).reduce{(a1, a2) => a1 + a2}), 2) -
    ((1 to 100).map{(b)=>pow(b,2).toInt}.reduce{(a1, a2) => a1 + a2})

println(result.toInt)
