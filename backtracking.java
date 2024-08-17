import java.util.*;
import java.lang.String;

public class backtracking {
    // code for backtracking in array
    public static void backtrackingInArray(int arr[], int index) {
        if (index == arr.length) {
            return;
        }
        arr[index] = index + 1;
        backtrackingInArray(arr, index + 1);
        arr[index] = index - 1;
    }

    public static void printArray(int arr[], int index) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    // backtracking for subsets
    public static void findSubsets(String str, int i, String ans) {
        // base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // code for yes
        findSubsets(str, i + 1, ans + str.charAt(i));
        // code for no
        findSubsets(str, i + 1, ans);

    }

    // finding permutations by backtrackking
    public static void findPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) +
                    str.substring(i + 1);
            findPermutations(newstr, ans + curr);
        }
    }

    // N queens question
    // print all possible ways of n queens
    // count ways of print n queens
    // check solution possible or not and print one solution
    public static boolean isSafe(char board[][], int row, int col) {
        // vertically
        for (int j = row - 1; j >= 0; j--) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }
        // diagonally left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonally right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static int count = 0;

    public static boolean nQueens(char chessBoard[][], int row) {
        // base case
        if (row == chessBoard.length) {
            // printBoard(chessBoard);
            // count++;
            return true;
        }

        for (int j = 0; j < chessBoard.length; j++) {
            if (isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q';
                // function call
                if (nQueens(chessBoard, row + 1)) {
                    return true;
                }
                ;
                // backtracking call
                chessBoard[row][j] = 'X';
            }
        }
        return false;

    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("*****************");
    }

    // grid ways code for find ways from anywhere in grid
    // it has large time complexity of 2^n
    public static int gridways(int x, int y, int n, int m) {
        // base case
        if (x == n - 1 && y == m - 1) {
            return 1;
        }
        if (x == n || y == m) {
            return 0;
        }
        // recursive calls
        return gridways(x, y + 1, n, m) + gridways(x + 1, y, n, m);
    }

    static recursion obj = new recursion();

    // mathematical approach of gridways
    // but can only be used for find ways from start point(0,0)
    // which has low time complexity of n (linear)
    public static int gridwaysmath(int n, int m) {
        return (obj.factorial(n - 1 + m - 1) /
                (obj.factorial(n - 1) * obj.factorial(m - 1)));
    }

    // sudoku code
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextrow = row;
        int nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextrow, nextcol);
        }

        for (int i = 1; i <= 9; i++) {
            if (safe(sudoku, row, col, i)) {
                sudoku[row][col] = i;
                if (sudokuSolver(sudoku, nextrow, nextcol)) {
                    return true;
                } else {
                    sudoku[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static boolean safe(int sudoku[][], int row, int col, int value) {
        // check in that row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == value) {
                return false;
            }
        }
        // check in that col
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == value) {
                return false;
            }
        }
        // check in that grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printBoard(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("*****************");
    }

    /************************************************/
    // backtracking Questions//

    // rat in a maze
    public static void ratInMaze(int maze[][], int row,
            int col, int solu[][]) {
        if (row == maze.length - 1 && col == maze.length - 1) {
            solu[row][col] = 1;
            printmazesolu(solu);
            return;
        }
        if (row < 0 || col < 0) {
            return;
        }
        if (row == maze.length || col == maze.length) {
            return;
        }
        if (maze[row][col] == 1) {
            solu[row][col] = 1;
            ratInMaze(maze, row + 1, col, solu);
            ratInMaze(maze, row, col + 1, solu);
            solu[row][col] = 0;
        } else {
            return;
        }

    }

    public static void printmazesolu(int mazesolu[][]) {
        System.out.println("*****maze solution*****");
        for (int i = 0; i < mazesolu.length; i++) {
            for (int j = 0; j < mazesolu.length; j++) {
                System.out.print(mazesolu[i][j] + " ");
            }
            System.out.println();
        }
    }

    // keypad cominations
    public static void letterCombinations(String num) {
        int len = num.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        combinations(0, len, new StringBuilder(), num);
    }

    public static void combinations(int si, int len, StringBuilder sb, String num) {
        if (si == len) {
            System.out.println(sb.toString());
            return;
        } else {
            char[] ch = keypad[Character.getNumericValue(num.charAt(si))];
            for (int i = 0; i < ch.length; i++) {
                combinations(si + 1, len, new StringBuilder(sb).append(ch[i]), num);
            }
        }
    }

    // keypad combination(self)
    final static char[][] keypad = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
            { 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void keypadcombinations(String str, char[][] keypad) {
        int len = str.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        combinations2(0, len, new StringBuilder(), str);
    }

    public static void combinations2(int si, int len, StringBuilder sb, String str) {
        if (si == len) {
            System.out.println(sb.toString());
            return;
        } else {
            char[] ch = keypad[Character.getNumericValue(str.charAt(si))];
            for (int i = 0; i < ch.length; i++) {
                sb.append(ch[i]);
                combinations2(si + 1, len, sb, str);
                sb.deleteCharAt(si);
            }
        }

    }

    // knight's tour
    public static void knights_tour(int board_size) {
        int board[][] = new int[board_size][board_size];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=-1;
            }
        }
        board[0][0]=0;
        if(footprints(0, 0, board, 1, (board_size * board_size))){
            printmazesolu(board);
        }else{
            System.out.println("solution doesnot exist");
        }
        return;
    }

    public static boolean footprints(int row, int col, int board[][], int si, int fi) {
        if (si == fi) {
            return true;
        }
        int rowmoves[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int colmoves[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        for (int i = 0; i < rowmoves.length; i++) {
            int nextrow = row + rowmoves[i];
            int nextcol = col + colmoves[i];
            if (nextrow >= 0 && nextcol >= 0 && nextrow < board.length
                    && nextcol < board.length && board[nextrow][nextcol]==-1) {
                board[nextrow][nextcol] = si;
                if(footprints(nextrow, nextcol, board, si+1, fi)){
                    return true;
                }else{
                    //backtracking
                    board[nextrow][nextcol]=-1;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // int arr[]=new int[5];
        // backtrackingInArray(arr, 0);
        // printArray(arr, 0);

        // String str = "abc";
        // // findSubsets(str, 0, " ");

        // findPermutations(str, "");

        // Scanne sc = new Scanner(System.in);
        // System.out.println("size of chessboard");
        // int n = sc.nextInt();
        // char[][] chessBoard = new char[n][n];
        // for (int i = 0; i < chessBoard.length; i++) {
        // for (int j = 0; j < chessBoard.length; j++) {
        // chessBoard[i][j] = 'X';
        // }
        // }
        // nQueens(chessBoard, 0);
        // System.out.println("total ways of n queens are: "+count);
        // if(nQueens(chessBoard, 0)){
        // System.out.println("soulution exist");
        // printBoard(chessBoard);
        // }else{
        // System.out.println("solution does not exist");
        // }

        // System.out.println(gridways(0, 0, 3, 3));
        // System.out.println(gridwaysmath(4, 4));

        // int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
        // { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
        // { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
        // { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
        // { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
        // { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
        // { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
        // { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
        // { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        // if(sudokuSolver(sudoku,0, 0)){
        // printBoard(sudoku);
        // System.out.println("solution exists");
        // }else{
        // System.out.println("solution does not exist");
        // }

        /*******************************************/
        // bacltracking questions//

        // int maze[][] = { { 1, 0, 1, 1 },
        // { 1, 1, 1, 1 },
        // { 0, 1, 1, 1 },
        // { 0, 1, 1, 1 } };
        // int mazesolu[][] = { { 0, 0, 0, 0 },
        // { 0, 0, 0, 0 };
        // { 0, 0, 0, 0 },
        // { 0, 0, 0, 0 } };
        // ratInMaze(maze, 0, 0, mazesolu);

        // letterCombinations("23");
        // keypadcombinations("236", keypad);
        knights_tour(7);
        
    }
}
