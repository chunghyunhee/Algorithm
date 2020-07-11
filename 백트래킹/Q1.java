/* to solve permutation, use dfs algorithm 
 * 1. n개중 r개를 뽑고자 한다. depth(결국 0~r을 의미하게 된다), n, r을 인자로 받는다
 * 2. depth는 0부터 시작하되, r과 같아지면 출력하고자 하는 depth가 달성된 형태이므로 출력한다
 * 3. depth가 r보다 작은 경우에는 방문하지 않은 원소 순회한다
 */

import java.util.Scanner;

public class Q1{
	
	// 순서를 지키면서 n개중에 r개를 뽑는 경우의 수 
	static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		
		if(depth == r) {
			print(output, r);
			return;	
		}
		
		for(int i=0; i<n; i++) {
			if(visited[i] != true) {
				visited[i] = true;
				output[depth] = arr[i];
				perm(arr, output, visited, depth+1, n, r);
				visited[i] = false;
			}
		}
	}
	
	
	// 시작인덱스와 끝 인덱스가 같으면 출력하는 형식 지정 메소드 
	static void print(int[] arr, int r) {
		
		for(int i=0; i<r; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int[] output = new int[m];
		boolean[] visited = new boolean[n];
		
		for(int i=0; i<n; i++)
			arr[i] = i+1;
		
		perm(arr, output, visited, 0, n, m);
		
		sc.close();
	}
	
	
}
