# N이 주어졌을 때 만들 수 있는 타일의 가짓수
# 경우의 수의 규칙상, 초깃값만 제외하고 피보나치 수열과 거의 비슷
import sys

def TileCount(n):
    value = [1, 2]    # memoization
    if n < 2:
        return (value[n] % 15746)
    else :
        for i in range(2, n+1):
            value.append((value[i-1] + value[i-2]) % 15746)
        return value[n]

# user input
n = int(sys.stdin.readline())
print(TileCount(n-1))
