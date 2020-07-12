## BackTracking
- Backtracking is a gerneral algorithm for finding solutions to some computational problems, notably constraint satisfaction problems.
- Constraint satisfaction problems(CSPs) are mathmatical questions defined as a set of objects whose sate must satisfy a number of constraints or limitations.
- a technique for listing all possible solutions for a combinational algorithm problem. 
- ex) permutation, combination, n-queen using DFS, BSF ect.. 

## 그래프 탐색
- 하나의 정점으로부터 시작하여 차례대로 모든 정점을 한번씩 방문하는 것
- ex) 특정 도시에서 다른 도시로 갈 수 있는지의 여부 등 

## DFS
- 루트노드에서 시작해여 다음 분기로 넘어가기 전에 해당 분기를 완벽히 
탐색하는 방법이다. 
- 넓게 탐색하기 전에 깊게 탐색하는 방법이다. 
- 모든 노드를 방문하고자 하는 경우에 이 방법을 사용한다. 
- 단순검색 속도면에서는 BFS보단 느리나, DFS가 더 간단하다


- DFS의 경우는 자기 자신을 호출하는 순환 알고리즘의 형태를 가진다. 
- 전위순회(pre-order traversal)을 포함한 다른 형태으 트리 순회는 모두
DFS의 한 종류이다. 
- 이 알고리즘을 구현할 때 가장 중요한 점은, 그래프 탐색의 경우, 어떤 노드를 
방문했었는지의 여부를 반드시 검사해야 한다는 점이다. 

## DFS구현방법
**1. 순환호출 방법 이용**
**2. 명시적인 스택 사용**
- 명시적인 스택을 사용하여 망문한 정점들을 스택에 저장했다가 다시 꺼내 작업
한다. 

![image](https://user-images.githubusercontent.com/49298791/87229415-b67ea600-c3e2-11ea-8f04-2c1746a38257.png)


## backtracking3. n-queen problem
1. 퀸은 같은 열이나 행에 있으면 안된다. 
2. 퀸은 같은 방향의 대각선에 있으면 안된다. 

- DFS방법도 결국은 가능한 모든 경우를 탐색하는 과정이되, 
**유망성이 없을 경우 backtracking하여 부모노드로 돌아가는 과정**을 거친다.
![image](https://user-images.githubusercontent.com/49298791/87240451-b61ef300-c454-11ea-90f1-bdabf447a84a.png)

- 구현방법 : 모든 경우의수를 탐색하면서 유망한지 ( 이 문제에서는
같은 열이나 행에 있는 값이 아닌지, 같은 방향의 대각선에 있는 값이 아닌지 )
를 확인하면서, 유망하지 않다면 backtracking을 갖추도록 구현해야 한다. 

***이슈1) 시간/ 메모리 부족 에러가 나던데 이런 부분을 줄일 수 있는 방법?*** \n
***이슈2) 처음부터 dfs를 생각해낼 수 있었는가에 대한 부분***
