// #3. n-Queen problem using backtracking
/*
 * ������ ����
 * 1. ���� ���� ���̳� ���� �־�� �ȵȴ�. 
 * 2. ���� ���� �����̳� �밢���� �־�� �ȵȴ�.
 * ���� �ΰ��� ������ ������ ������ ���ϸ� �θ���� backtracking
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
	
	// ���������� Ȯ�� 
	static int count = 0;
	public static boolean isPromising(int[] q, int n) {
		for(int i=0; i<n; i++) {
			if(q[i] == q[n]) return false; //���� ������ Ȯ��
			if((q[i] - q[n]) == (n-i)) return false; // �밢������ Ȯ��1
			if((q[n] - q[i]) == (n-i)) return false; // �밢������ Ȯ��2
		}
		return true;
	}
	public static void enumerate(int N) {
		int[] a = new int[N];
		enumerate(a, 0);
	}
	public static void enumerate(int[] q, int n) {
		int N = q.length;
		// n�� ������ ���Ҵٸ� count����
		if(n==N) {
			count++;
		} else {
			for(int i=0; i<N; i++) {
				q[n] = i;
				if(isPromising(q,n)) enumerate(q, n+1); //�����ϸ� ��� Ž�� 
			}
		}
	}
	

}
