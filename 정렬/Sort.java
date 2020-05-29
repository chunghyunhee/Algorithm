// #2. 정렬
// N개의 수가 주어졌을 때 오름차순 정렬
// 시간복잡도 고려하여 퀵정렬사용 
import java.util.Scanner;

class QuickSort {
	
	// 결국 partition을 각 subarray에 재귀적으로 적용하면서 정렬하는 것을 의미
	public void Sort(int arr[], int p, int r) {
		if(p<r) {
			int q = partition(arr, p, r);
			Sort(arr, p, q);
			Sort(arr,q+1, r);
		}
	}
	
	public int partition(int arr[], int p, int q) {
		int x = arr[p]; //pivot값으로 arr으로 첫번째값
		int i = p;
		int tmp;
		
		for(int j=p+1; j<q; j++) {
			if(arr[j] <= x) { //비교대상이 pivot보다 작으면 값 바꾼다
				i = i+1;
				tmp = arr[j]; //exchange
				arr[j] = arr[i];
				arr[i] = tmp;
			}
		}
		tmp = arr[p]; //pivot값을 lower subarray의 마지막 인덱스로 삽입
		arr[p] = arr[i];
		arr[i] = tmp;
		return i;
	}
}
public class Sort{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuickSort quick = new QuickSort();
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int num;
		for(int i=0; i<N; i++) { // 입력받은 값들을 배열에 저장 
			num = sc.nextInt();
			arr[i] = num;
		}
		
		quick.Sort(arr, 0, N); // 퀵 정렬 
		
		for(int i=0; i<N; i++) { // 정렬한 값들을 배열에 저장 
			System.out.println(arr[i]);
		}
		
		sc.close();
		
	}
}
