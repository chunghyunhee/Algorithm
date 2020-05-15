// ox������ ������ ���ϴ� ���α׷��� �ۼ�
import java.util.*;

// ���ڿ��� �޾Ƽ� ������ ����ϰ� �ϴ� Ŭ���� 
class ScoreCompute{
	String s; 

	public ScoreCompute(String s) {
		this.s = s;
	}
	// ��������  o�� ���� ���� ��� �޼��� 
	public int compute(String s) {
		int n = s.length();
		int score = 0; //���� 
		int total = 0; //���� ���� 
		
		for(int i=0; i<n; i++) {
			if(s.charAt(i)=='O') {
				score++;
			}
			else {
				score = 0; //���� O�� �ƴϸ� �����ʱ�ȭ 
			}
			total += score; //���� ���� ��� 
		}
		return total;
		
	}
}
public class OXEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //���̽� �� 
		String ox[] = new String[N]; //ox�� �����ϴ� �迭 ���� 
		
		for(int i=0; i<N; i++) {
			ox[i] = sc.next();//ox�� ������ ���� �޴´�.
		}
		for(int j=0; j<N; j++) {
			ScoreCompute score = new ScoreCompute(ox[j]);
			int f = score.compute(ox[j]); //�� ���� ��� 
			System.out.println(f);
		}

		sc.close();
		
	}
}
