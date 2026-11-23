class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s = new HashSet<>();

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[i].length; ++j) {
                if (board[i][j] == '.') continue;

                if (s.contains("r" + i + board[i][j]) ||
                    s.contains("c" + j + board[i][j]) ||
                    s.contains("sq" + i/3 + j/3 + board[i][j])) return false;

                s.add("r" + i + board[i][j]);
                s.add("c" + j + board[i][j]);
                s.add("sq" + i/3 + j/3 + board[i][j]);
            }
        }
        return true;
    }
}
