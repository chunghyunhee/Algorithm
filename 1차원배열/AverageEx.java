// ���Ӱ� ������ ������� ���� ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ѵ�. 
import java.util.*;

public class AverageEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ���躻 ������ �� �Է¹��� ��
		int arr[] = new int[N]; // ���� ������ �迭 
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// �ְ��� ���
		double max = arr[00];
		double sum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			sum += arr[i]; 
			if(max < arr[i])
				max = arr[i];
		}
		
		// ���ο� ��� ���
		double average = 0.;
		average = 100*sum/max/N;
		System.out.print(average);
		
		sc.close();
	}

}
