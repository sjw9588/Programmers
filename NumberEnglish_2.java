import java.util.HashMap;
import java.util.Map;

public class NumberEnglish_2 {
	public static void main(String[] args) {
		NumberEnglish_2 numberEnglish = new NumberEnglish_2();
		
		String data = "one4seveneight";
		int res = numberEnglish.Solution(data);
		System.out.println("결과 : " + res);
	}

	public static int Solution(String s) {

		String word[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		
		Map<String, Integer> map = new HashMap<>();
		
		int i = 0;
		for(String num : word) {
			map.put(num, i++);
		}
		for(String num : word) {
			s = s.replace(num, map.get(num).toString());
		}
		
		int result = Integer.valueOf(s);	// 문자열 형태의 s를 정수형식으로 변환.
		return result;
	}
}
