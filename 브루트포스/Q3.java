// #1. ���Ʈ ���� 
// 666�̶�� ���� �� ������ �Ǵ� �����̴�. 
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = 0;
		// 666�� �����Ѵٸ� count�ϴ� ���(N����)
		while(true) {
			if(Integer.toString(tmp).contains("666"))
				N--;
			if(N==0)
				break;
			tmp++;
		}
		// ���
		System.out.println(tmp);
		
	}
	

}
