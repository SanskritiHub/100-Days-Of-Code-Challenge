import java.util.HashSet;

public class validSudoku {
	
	public boolean isValidSudoku(char[][] board) {
        HashSet num = new HashSet();
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j]!='.'){
                    if(!num.add("Row" + i + board[i][j]) || (!num.add("Col" + j + board[i][j])
                        || (!num.add("Box" + (i/3)*3+j/3 + board[i][j])))){
                        return false;
                    }
                }
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
