/* to solve permutation, use dfs algorithm 
 * 1. n���� r���� �̰��� �Ѵ�. depth(�ᱹ 0~r�� �ǹ��ϰ� �ȴ�), n, r�� ���ڷ� �޴´�
 * 2. depth�� 0���� �����ϵ�, r�� �������� ����ϰ��� �ϴ� depth�� �޼��� �����̹Ƿ� ����Ѵ�
 * 3. depth�� r���� ���� ��쿡�� �湮���� ���� ���� ��ȸ�Ѵ�
 */

import java.util.Scanner;

public class Q1{
	
	// ������ ��Ű�鼭 n���߿� r���� �̴� ����� �� 
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
	
	
	// �����ε����� �� �ε����� ������ ����ϴ� ���� ���� �޼ҵ� 
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
