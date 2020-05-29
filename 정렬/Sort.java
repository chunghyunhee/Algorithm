// #2. ����
// N���� ���� �־����� �� �������� ����
// �ð����⵵ ����Ͽ� �����Ļ�� 
import java.util.Scanner;

class QuickSort {
	
	// �ᱹ partition�� �� subarray�� ��������� �����ϸ鼭 �����ϴ� ���� �ǹ�
	public void Sort(int arr[], int p, int r) {
		if(p<r) {
			int q = partition(arr, p, r);
			Sort(arr, p, q);
			Sort(arr,q+1, r);
		}
	}
	
	public int partition(int arr[], int p, int q) {
		int x = arr[p]; //pivot������ arr���� ù��°��
		int i = p;
		int tmp;
		
		for(int j=p+1; j<q; j++) {
			if(arr[j] <= x) { //�񱳴���� pivot���� ������ �� �ٲ۴�
				i = i+1;
				tmp = arr[j]; //exchange
				arr[j] = arr[i];
				arr[i] = tmp;
			}
		}
		tmp = arr[p]; //pivot���� lower subarray�� ������ �ε����� ����
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
		for(int i=0; i<N; i++) { // �Է¹��� ������ �迭�� ���� 
			num = sc.nextInt();
			arr[i] = num;
		}
		
		quick.Sort(arr, 0, N); // �� ���� 
		
		for(int i=0; i<N; i++) { // ������ ������ �迭�� ���� 
			System.out.println(arr[i]);
		}
		
		sc.close();
		
	}
}
