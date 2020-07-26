# R,G,B로 모든 집을 칠하는 비용의 최솟값
def min(a,b):
    return a if a<=b else b

def minCost(n, arr):
    new_arr = [[0]*3 for i in range(n)]

    for i in range(n):
        if i == 0:
            new_arr[i] = arr[i]
        else:
            new_arr[i][0] = arr[i][0] + min(new_arr[i-1][1], new_arr[i-1][2])
            new_arr[i][1] = arr[i][1] + min(new_arr[i - 1][0], new_arr[i - 1][2])
            new_arr[i][2] = arr[i][2] + min(new_arr[i - 1][0], new_arr[i - 1][1])
    return min(min(new_arr[n-1][0], new_arr[n-1][1]), new_arr[n-1][2])


# user input
n = int(input())                # 집의 수 n
arr = [[0]*3 for i in range(n)] # cost 입력 행렬
for i in range(n):
    arr[i][0], arr[i][1], arr[i][2] = map(int, input().split())

# print result
print(minCost(n, arr))