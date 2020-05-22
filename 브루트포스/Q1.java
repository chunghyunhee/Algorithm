// # 1. ����
// ������ ��� 3�� ī���� ���� ����Ͽ� M���� ���̸� �˾ƾ� �Ѵ�. 
import java.util.*;

// 3���� ����� �� M�� ���� �ʵ� ���� ����� ���� ���� �ϴ� Ŭ���� 
class BlackEx{
	Vector <Integer> v = new Vector<Integer>();
	int M; int N;
	public BlackEx(Vector<Integer>v, int M, int N) {
		this.v = v;
		this.M = M; this.N = N;
	}
	public int SimilarM() {
		// 3���� ������ ������ ����Ͽ� ���̰� ���� ���� ���� ���� 
		int sum = 0; //�� ���� ���� ����� �� 
		int max = 0; // ������ �� �� M���� ���̰� �ּ��� ������ 
		for(int i=0; i<N-2;i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					// 3���� ������ �� 
					sum = v.get(i)+v.get(j)+v.get(k);
					// 3���� �����հ� M���� ���� �� �ּڰ��� ���Ѵ�
					// ���̰� ����� ��쿡 ���ؼ��� ����Ѵ�
					if (M>sum) {
						//System.out.println("M-sum"+(M-sum)+"min:"+min);
						if(sum>max) {
							//System.out.println(sum);
							max = sum;
						}
					}
					else if(M==sum) {
						// ������ �װ� ������ �� 
						max = sum;
						break;
					}
				}
			}
		}
		return max;
	}
}
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector <Integer> v = new Vector<Integer>();
		int N = sc.nextInt(); // N�� �� 
		int M = sc.nextInt(); // M�� �� 
		// ���Ϳ� �� ����
		for(int i=0; i<N; i++) {
			v.add(sc.nextInt()); 
		}

		// ��°�
		BlackEx be = new BlackEx(v, M, N);
		System.out.println(be.SimilarM());
		sc.close();
	}
}
