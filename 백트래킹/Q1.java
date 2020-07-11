/*
 * 1. ���� �˰����� �����ε����� �� �ε����� �޴´�
 * 2. ���� �ε����� �� �ε����� ���ٸ� ���� �ϳ��̰ų�, ��� �ε����� ��ȸ�����Ƿ� ���
 * 3. �ε����� ���� �ٸ���, ���ۺ��� ������ ��� �ε����� ���� ���� �ε����� �ڸ��� �ٲٰ�
 * ���� �ε����� 1��ŭ �̵��Ͽ� ����Լ��� ȣ������, �ٽ� �ڸ��� �ٲ� �ε����� ���� �ε�����
 * �ڸ��� swap 
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
