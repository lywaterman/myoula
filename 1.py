#coding=utf8

sum = 0
def test(N):
    for x in range(1, N):
        if x % 3 == 0 or x % 5 == 0:
            global sum
            sum = sum + x


test(1000)

sum([x for x in range(1000) if x % 3 == 0 or x % 5 == 0])

