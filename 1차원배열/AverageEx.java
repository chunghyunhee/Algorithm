// 새롭게 점수를 계산했을 때의 새로운 평균을 구하는 프로그램을 작성한다. 
import java.util.*;

public class AverageEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 시험본 과목의 수 입력받은 값
		int arr[] = new int[N]; // 점수 저장할 배열 
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 최고점 계산
		double max = arr[00];
		double sum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			sum += arr[i]; 
			if(max < arr[i])
				max = arr[i];
		}
		
		// 새로운 평균 계산
		double average = 0.;
		average = 100*sum/max/N;
		System.out.print(average);
		
		sc.close();
	}

}
