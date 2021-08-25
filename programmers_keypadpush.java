
public class programmers_keypadpush {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		String hand = "right";
		String ans = solution(numbers, hand);
		System.out.println(ans);		
	}
	private static String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int left_dis, right_dis;				//각각 왼손과 오른손으로부터의 거리를 의미함.
		int left = 10, right = 12;				//초기에 왼손은 *(10), 오른손은 #(12)에 놓여있음.
		
		for( int n : numbers) {
			if ((n==1) || (n==4) || (n==7)) {
				sb.append("L");
				left = n;
			}
			else if((n==3) || (n==6) || (n==9)) {
				sb.append("R");
				right = n;
			}
			else {
				if(n==0) n=11;
				left_dis = Math.abs(n-left)/3 + Math.abs(n-left)%3;
				right_dis = Math.abs(right-n)/3 + Math.abs(right-n)%3;
				
				if(left_dis == right_dis) {
					if(hand.equals("right")) {
						sb.append("R");
						right = n;
					}
					else if(hand.equals("left")){
						sb.append("L");
						left = n;
					}
				}
				else if(left_dis > right_dis) {
					sb.append("R");
					right = n;
				}
				else if(right_dis > left_dis) {
					sb.append("L");
					left = n;
				}
			}
		}
		return sb.toString();
	}
}
