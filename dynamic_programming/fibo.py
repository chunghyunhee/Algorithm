# n을 입력하면 n번째 피보나치 값을 출력한다
def fibo(n):
    value = [0, 1]    # memoization
    if n < 2:
        return value[n]
    else :
        for i in range(2, n+1):
            value.append(value[i-1] + value[i-2])
        return value[n]

# user input
n = int(input())
print(fibo(n))