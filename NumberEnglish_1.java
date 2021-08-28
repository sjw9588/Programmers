
public class NumberEnglish_1 {
	public static void main(String[] args) {
		String data = "one4seveneight";
		System.out.println("결과 : " + Solution(data));
	}

	public static int Solution(String s) {

		String word[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String number[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		//각 숫자에 따른 문자와 숫자를 차례로 각 배열에 선언해준다.
		
		/*for (int i = 0; i < 10; i++) {		//0~9까지의 영어단어를 숫자로 교환하기 위한 for문.
			s = s.replaceAll(word[i], number[i]);
		}	// word배열의 각 배열원소에 대응하는 number배열의 원소로 교체해준다.
*/
		
		for(int i=0; i<word.length; i++) {
            s = s.replace(word[i], Integer.toString(i));
        }
		int result = Integer.parseInt(s);	// 문자열 형태의 s를 정수형식으로 변환.
		return result;
	}
}
