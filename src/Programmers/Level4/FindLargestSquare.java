package Programmers.Level4;

public class FindLargestSquare {
    public int findLargestSquare(char [][]board)
    {
        int answer = 0;
        int[][] mid = new int[board.length][board[0].length];

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if( board[i][j] == 'O' )
                    mid[i][j] = 1;
                else
                    mid[i][j] = 0;
            }
        }

        for(int i=1;i<mid.length;i++) {
            for(int j=1;j<mid[i].length;j++) {
                if( mid[i][j] == 1 ) {
                    int minVal = 0;
                    minVal = mid[i-1][j] < mid[i][j-1] ? mid[i-1][j] : mid[i][j-1];
                    minVal = mid[i-1][j-1] < minVal ? mid[i-1][j-1] : minVal;

                    mid[i][j] = minVal + 1;
                    answer = answer < mid[i][j] ? mid[i][j] : answer;
                }
            }
        }
        return answer*answer;
    }
}
