package arrays;

/*
 * https://leetcode.com/problems/valid-tic-tac-toe-state/description/
 */
public class ValidTicTacToe {

    /*
       Count 'X' and 'O': Ensure 'X' is either equal to or one more than 'O'.
        Check for winners: Identify if 'X' or 'O' has won using row, column, and diagonal checks.
        Validate the board state:
        If both 'X' and 'O' are winners, return false.
        If 'X' wins, it must have one more move than 'O'.
        If 'O' wins, both players must have the same move count.
        Return true if all conditions are satisfied.    
     * TC: O(1)
     * SC:(1)
     */
    public boolean validTicTacToe(String[] board) {
        int countX=0; int countO=0;

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length();j++){
                if(board[i].charAt(j)=='X') countX++;
                if(board[i].charAt(j)=='O') countO++;
            }
        }

        //if count of O is greater than X then O played first or took more turns
        if(countO > countX) return false;

        //player takes turns - X played more turns
        if(countX > countO+1) return false;

        boolean Xwins=isWinner(board,'X');
        boolean Owins=isWinner(board,'O');

        //both cannot win
        if(Xwins && Owins) return false;

        //X must have one more move tha O
        if(Xwins && countX!=countO+1) return false;

        //if O wins both playes must have same move count
        if(Owins && countX!=countO) return false;

        return true;

    }

    public boolean isWinner(String[] board,char player){
        for(int i=0;i<board.length;i++){
            //rows and columns validity
            if(board[i].equals(""+player+player+player) || 
                (board[0].charAt(i)==player &&
                board[1].charAt(i)==player &&
                board[2].charAt(i)==player)
            )
                return true;
        }

        //diagonals validity

        return (
            board[0].charAt(0) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(2) == player) ||
        (
            board[0].charAt(2) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(0) == player
        );
    }

}
