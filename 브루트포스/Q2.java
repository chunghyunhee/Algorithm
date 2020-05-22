// #2. ��ġ
import java.util.*;

// (������,Ű)�� �����ϴ� Ŭ����
class Frame{
	int height, weight;
	public Frame(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
}

// ��ġ�� ���Ͽ� ������ ����� ����� ���ϴ� Ŭ����(����� index�� ����)
class CompareFrame{
	Vector <Frame> v = new Vector<Frame>();
	int index;
	public CompareFrame(Vector<Frame>v, int index) {
		this.v = v; this.index = index;
	}
	
	// ������ϴ� �ż��� 
	public int rankMake(){
		// ������ ����� Ű�� �������� ��ü 
		Frame f = v.get(index);
		int rank = 1;
		
		// ��
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
		// Frame��ü�� ��ҷ� ������ ���� ����
		Vector <Frame> v = new Vector<Frame>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //�Է� �л��� 
		for(int i=0; i<N; i++) {
			// ������ ���Ϳ� ���� 
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			v.add(new Frame(num1,num2));
		}
		
		// ��ġ ������ ���� ����Ѵ�. 
		for(int i=0; i<N; i++) {
			CompareFrame cf = new CompareFrame(v, i);
			int rank = cf.rankMake();
			System.out.print(rank+" ");
		}
		sc.close();
			
	}

}
