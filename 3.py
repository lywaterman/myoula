import fn

def isPrime(n):
    if n<2: return False
    if n==2: return True
    for i in range(3,int(n**0.5)+1,2):   # only odd numbers
        if n%i==0:
            return False
    return True
    
def chujin(n, i):
    while True:
        if n % i == 0:
            n = n / i
            return chujin(n, i)
        else:
            return n

##质数的生成
zishus = []
for i in xrange(1, 100000):
    if isPrime(i):
        zishus.append(i)
        
def fenjie(n, i):
    global zishus
    xx = chujin(n, zishus[i])
    
    if isPrime(xx):
        return xx
    else:
        return fenjie(xx, i+1)
    
            

print(fenjie(600851475143, 1))
