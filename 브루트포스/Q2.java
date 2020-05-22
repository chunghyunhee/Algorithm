// #2. 덩치
import java.util.*;

// (몸무게,키)를 저장하는 클래스
class Frame{
	int height, weight;
	public Frame(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
}

// 덩치를 비교하여 지정한 사람의 등수를 구하는 클래스(사람은 index로 받음)
class CompareFrame{
	Vector <Frame> v = new Vector<Frame>();
	int index;
	public CompareFrame(Vector<Frame>v, int index) {
		this.v = v; this.index = index;
	}
	
	// 등수정하는 매서드 
	public int rankMake(){
		// 지정한 사람의 키와 몸무게의 객체 
		Frame f = v.get(index);
		int rank = 1;
		
		// 비교
		for(int i=0; i<v.size(); i++) {
			Frame v1 = v.get(i);
			if(i==index) {
				continue;
			}
			else if(f.height<v1.height && f.weight<v1.weight) {
				rank++;
			}
		}
		return rank;
		
	}
	
}
public class Q2 {
	public static void main(String[] ars) {
		// Frame객체를 요소로 가지는 벡터 생성
		Vector <Frame> v = new Vector<Frame>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //입력 학생수 
		for(int i=0; i<N; i++) {
			// 정보를 벡터에 저장 
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			v.add(new Frame(num1,num2));
		}
		
		// 덩치 순위를 구해 출력한다. 
		for(int i=0; i<N; i++) {
			CompareFrame cf = new CompareFrame(v, i);
			int rank = cf.rankMake();
			System.out.print(rank+" ");
		}
		sc.close();
			
	}

}
