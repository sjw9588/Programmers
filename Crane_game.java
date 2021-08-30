import java.util.Stack;

public class Crane_game {
	public static void main(String[] args) {
		int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int moves[] = {1,5,3,5,1,2,1,4};
		int answer = Solution(board,moves);
		
		System.out.println(answer);
	}
	
	public static int Solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> st = new Stack<Integer>();
		
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
				else continue;	// board 배열의 해당되는 행에 인형이 없는 경우. 아무일도 일어나지 않는다.
			}
		}
		return answer;
	}
}
