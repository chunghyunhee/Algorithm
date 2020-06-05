// #1.
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;


public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		List<Integer> list = new ArrayList<>(); //입력값 받을 리스트 Collection 선언 
		int sum = 0; int value = 0; 
		
		for(int i=0; i<N; i++) { 
			value = sc.nextInt();
			list.add(value); //입력값 저장 
			sum+=value; // 총합계산 
		}
		
		// 산술평균 출력
		System.out.println(Math.round(((double)sum/N)));
		
		// 중앙값 계산, 출력
		
		list.sort(Comparator.naturalOrder()); //정렬 
		
		if(N%2 == 0) { 
			System.out.println((double)(list.get((N/2)-1)+list.get(((N/2)+1)-1))/2);
		}
		else {
			System.out.println(list.get(((N+1)/2)-1));
		}
		
		
		
		// 최빈값 계산, 출력 
		long mode;
		Map<Integer, Long> freq = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		long MostFreq = freq.values().stream().max(Comparator.naturalOrder()).get(); 
		Integer[] modes = freq.keySet().stream().filter(s->freq.get(s)==MostFreq).sorted(Comparator.naturalOrder()).toArray(Integer[]::new);  
		
		if(modes.length == 1) mode = modes[0];
		else mode = modes[1];
		System.out.println(mode);
		
		// 범위 출력 
		System.out.println(list.get(N-1)-list.get(0));
		
		sc.close();
		
	}

}
