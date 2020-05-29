// #1. 브루트 포스 
// 666이라는 수만 들어가 있으면 되는 형태이다. 
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = 0;
		// 666을 포함한다면 count하는 방법(N까지)
		while(true) {
			if(Integer.toString(tmp).contains("666"))
				N--;
			if(N==0)
				break;
			tmp++;
		}
		// 출력
		System.out.println(tmp);
		
	}
	

}
