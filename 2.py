#coding=utf8

def fib():
    x1 = [1, 2]
    x = 3
    while True:
        x2 = x1[x-3] + x1[x-2]
        if x2 >= 4000000:
            return x1
        x1.append(x1[x-3] +  x1[x-2])
        x = x + 1

    return x1

fib = fib()
print(sum([x for x in fib if x % 2 == 0]))
