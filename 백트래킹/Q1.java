/*
 * 1. 순열 알고리즘의 시작인덱스와 끝 인덱스를 받는다
 * 2. 시작 인덱스와 끝 인덱스가 같다면 원소 하나이거나, 모든 인덱스를 순회했으므로 출력
 * 3. 인덱스가 서로 다르면, 시작부터 끝까지 모든 인덱스에 대해 시작 인덱스와 자리를 바꾸고
 * 시작 인덱스를 1만큼 이동하여 재귀함수를 호출한후, 다시 자리를 바꾼 인덱스와 시작 인덱스의
 * 자리를 swap 
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
