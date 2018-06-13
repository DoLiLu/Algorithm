package Programmers.Level4;

public class Hopscotch {
    int hopscotch(int[][] board, int size) {
        return hopscotch(board, size, 0, -1);
    }
    private int hopscotch(int[][] board, int size, int y, int idx) {
        if (y >= size) return 0;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            if (i != idx) {
                answer = Math.max(hopscotch(board, size, y + 1, i) + board[y][i], answer);
            }
        }
        return answer;
    }
}
