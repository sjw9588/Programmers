import java.util.Stack;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> st = new Stack();
		for (int i = 0; i < moves.length; i++) { // 크레인의 이동횟수와 동일, board의 열의 개수.
			for (int j = 0; j < board.length; j++) { // board의 행의 개수

				// board배열의 j행에서 moves 위치에 인형이 존재하는 경우.
				if (board[j][moves[i] - 1] != 0) {
					if (st.empty()) { // 인형 담을 스택이 비어있는 경우.
						st.push(board[j][moves[i] - 1]);
					} else {
						if (st.peek() == board[j][moves[i] - 1]) {
							st.pop();
							answer += 2;
						} else {
							st.push(board[j][moves[i] - 1]);
						}
					}
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
