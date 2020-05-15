// ox문제의 점수를 구하는 프로그램을 작성
import java.util.*;

// 문자열을 받아서 점수를 계산하게 하는 클래스 
class ScoreCompute{
	String s; 

	public ScoreCompute(String s) {
		this.s = s;
	}
	// 연속적인  o에 따른 총점 계산 메서드 
	public int compute(String s) {
		int n = s.length();
		int score = 0; //점수 
		int total = 0; //최종 점수 
		
		for(int i=0; i<n; i++) {
			if(s.charAt(i)=='O') {
				score++;
			}
			else {
				score = 0; //연속 O이 아니면 점수초기화 
			}
			total += score; //최종 점수 계산 
		}
		return total;
		
	}
}
public class OXEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //케이스 수 
		String ox[] = new String[N]; //ox를 저장하는 배열 선언 
		
		for(int i=0; i<N; i++) {
			ox[i] = sc.next();//ox값 라인을 전부 받는다.
		}
		for(int j=0; j<N; j++) {
			ScoreCompute score = new ScoreCompute(ox[j]);
			int f = score.compute(ox[j]); //각 라인 계산 
			System.out.println(f);
		}

		sc.close();
		
	}
}
