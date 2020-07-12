// #3. n-Queen problem using backtracking
/*
 * 유망한 조건
 * 1. 퀸은 같은 행이나 열에 있어서는 안된다. 
 * 2. 퀸은 같은 방향이나 대각선에 있어서는 안된다.
 * 위의 두가지 유망한 조건을 갖추지 못하면 부모노드로 backtracking
 */
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		enumerate(n);
		System.out.println(count);
		
	}
	
	// 유망한지를 확인 
	static int count = 0;
	public static boolean isPromising(int[] q, int n) {
		for(int i=0; i<n; i++) {
			if(q[i] == q[n]) return false; //같은 열인지 확인
			if((q[i] - q[n]) == (n-i)) return false; // 대각선방향 확인1
			if((q[n] - q[i]) == (n-i)) return false; // 대각선방향 확인2
		}
		return true;
	}
	public static void enumerate(int N) {
		int[] a = new int[N];
		enumerate(a, 0);
	}
	public static void enumerate(int[] q, int n) {
		int N = q.length;
		// n이 끝까지 돌았다면 count증가
		if(n==N) {
			count++;
		} else {
			for(int i=0; i<N; i++) {
				q[n] = i;
				if(isPromising(q,n)) enumerate(q, n+1); //유망하면 계속 탐색 
			}
		}
	}
	

}
