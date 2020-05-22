// # 1. 블랙잭
// 가능한 모든 3개 카드의 합을 고려하여 M과의 차이를 알아야 한다. 
import java.util.*;

// 3장을 골랐을 떄 M을 넘지 않되 가장 가까운 값을 고르게 하는 클래스 
class BlackEx{
	Vector <Integer> v = new Vector<Integer>();
	int M; int N;
	public BlackEx(Vector<Integer>v, int M, int N) {
		this.v = v;
		this.M = M; this.N = N;
	}
	public int SimilarM() {
		// 3개의 숫자의 조합을 고려하여 차이가 가장 작은 값을 저장 
		int sum = 0; //세 수의 합을 계산한 값 
		int max = 0; // 세수의 합 중 M과의 차이가 최소인 합저장 
		for(int i=0; i<N-2;i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					// 3개의 조합의 합 
					sum = v.get(i)+v.get(j)+v.get(k);
					// 3개의 조합합과 M과의 차이 중 최솟값을 구한다
					// 차이가 양수인 경우에 대해서만 고려한다
					if (M>sum) {
						//System.out.println("M-sum"+(M-sum)+"min:"+min);
						if(sum>max) {
							//System.out.println(sum);
							max = sum;
						}
					}
					else if(M==sum) {
						// 같으면 그게 무조건 답 
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
		int N = sc.nextInt(); // N의 값 
		int M = sc.nextInt(); // M의 값 
		// 벡터에 값 삽입
		for(int i=0; i<N; i++) {
			v.add(sc.nextInt()); 
		}

		// 출력값
		BlackEx be = new BlackEx(v, M, N);
		System.out.println(be.SimilarM());
		sc.close();
	}
}
