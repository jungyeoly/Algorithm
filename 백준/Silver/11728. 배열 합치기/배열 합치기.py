N, M = map(int, input().split())

A = list(map(int, input().split()))
B = list(map(int, input().split()))

string = A + B

string.sort()

for i in string:
    print(i, end=' ')