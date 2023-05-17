package FinalProject_MineSweeper;

import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    private final Scanner sc = new Scanner(System.in);
    private final Random rm = new Random();
    private int row;
    private int col;
    private String[][] mineField;
    private String[][] revealed;

    // It starts the game and controls the flow of the game.
    public void start(){
        // Here we determined our minefield, prepared our mines and placed them in our field.
        System.out.println("Welcome to Minesweeper Game");
        System.out.print("Determine the Number of Lines : "); // This line prints a message asking the user to specify the number of lines and assigns the user input to the row variable.
        row = sc.nextInt();
        System.out.print("Determine Number of Columns : "); // This line prints a message asking the user to specify the number of columns and assigns the user input to the col variable.
        col = sc.nextInt();

        int mineCount = (row * col) / 4; // This line is used to determine the number of mines. It is assigned to the variable mineCount, which is one quarter of the product of the number of rows and columns.

        // These lines form two-dimensional arrays (matrices) named mineField and revealed. These sequences hold the state of the game board and which squares have been unlocked
        mineField = new String[row][col];
        revealed = new String[row][col];

        // These nested loops initialize all elements of mineField and revealed arrays as "-" (unopened). In this way, the game board and the opened squares are prepared.
        for (int i = 0; i < mineField.length; i++) {
            for (int j = 0; j < mineField[i].length; j++) {
                mineField[i][j] = "-";
                revealed[i][j] = "-";
            }
        }
        // This cycle ensures random placement of mines. The loop continues until the mineCount variable reaches zero. A random row and column is selected at each loop step.
        // If the selected square is "-" (unopened), a mine ("*") is placed on that square and the mineCount is decremented by one.
        while (mineCount > 0) {
            int i = rm.nextInt(row);
            int j = rm.nextInt(col);
            if (mineField[i][j].equals("-")) {
                mineField[i][j] = "*";
                mineCount--;
            }
        }
        // This line prints the game board in its initial state. At this stage all squares appear as "-".
        printRevealed();
        // This line starts playing the game. It allows to receive input from the user and manage the flow of the game by calling the play method.
        play();
    }

    // This method will be the part where the game is played.
    private void play() {
        boolean finish = false;
        while (!finish) { // This keeps the game going until the "finish" variable is "true". So, the cycle in which the game will be played begins here.
            // We ask the user to enter two numbers: row and column numbers.
            System.out.print("Enter row: ");
            int seRow = sc.nextInt();
            System.out.print("Enter column: ");
            int seCol = sc.nextInt();

            int number = 0;
            if (seRow < row && seCol < col) { // If the row and column numbers entered by the user do not exceed the limits of the game board, we enter the code block.
                // If the square in the coordinates entered by the user is "-", the game continues and the number of mines in the square entered by the user is calculated.
                // If the square has not been selected before, in a matrix called "revealed" the value "-" is replaced by the number of mines in the selected square.
                if (mineField[seRow][seCol].equals("-") && revealed[seRow][seCol].equals("-")) {
                    // The number of mines in the square selected by the user is calculated.
                    // Two loops are used, these loops scan all frames surrounding the selected frame, and the "number" variable is incremented if the square is a mine.
                    for (int i = seRow - 1; i < seRow + 2; i++) {
                        for (int j = seCol - 1; j < seCol + 2; j++) {
                            if (i >= 0 && j >= 0 && i < row && j < col && mineField[i][j].equals("*")) {
                                number++;
                            }
                            revealed[seRow][seCol] = Integer.toString(number);
                        }
                    }
                    printRevealed(); // Then the game board is reprinted, with the squares next to the one selected by the user.
                    // If we have won, we will check if we have won the game by calling another method called "checkWin".
                    // If we win, it prints the message "Congratulations, you won", also prints the game board with the mines, and ends the game by setting the "finish" variable to "true".
                    if (!checkWin()) {
                        System.out.println("Congratulation! You won");
                        printMine();
                        finish = true;
                    }
                    // If there is a mine in the square selected by the user, it prints the message "You pressed the mine", prints the game board with the mines and ends the game by setting the "finish" variable to "true".
                } else if (mineField[seRow][seCol].equals("*")) { //
                    System.out.println("You stepped on a mine.\n Game over");
                    printMine();
                    finish = true;
                } else if (!revealed[seRow][seCol].equals("-")) { // If the square selected by the user has been selected before, it will display the message "Please select a different frame".
                    System.out.println("Please choose a different square.\n" +
                            "This square has already been selected.");
                }
            } else { // If the row and column numbers entered by the user exceed the limits of the game board,
                     // the message "Please do not choose from outside the field" is printed on the screen.
                System.out.println("Please do not choose from outside the area.\n" +
                        "Wrong choice");
            }
        }
    }

    // The purpose of this method is to print the opened game board.
    private void printRevealed() {
        System.out.println("---------------------------------"); // This line prints a separator line indicating the beginning of the game board.
        for (String[] strings : revealed) { // This loop scans a two-dimensional array (matrix) named "revealed". Each "strings" string represents a row of the "revealed" string.
            // This nested loop prints the elements (squares) in each row. The inner loop assigns each element to a variable named "string" and prints it to the screen. Then it comes next to other elements by adding a space.
            // When the inner loop is complete, System.out.println() is used to move to the next line.
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------"); // This line prints a separator line indicating the end of the game board.
    }
    // The purpose of this method is to print the game board with the mines.
    private void printMine() {
        System.out.println("---------------------------------"); // This line prints a separator line indicating the beginning of the game board.
        for (String[] strings : mineField) {  // This loop scans a two-dimensional array (matrix) named "mineField". Each "strings" array represents a row of the "mineField" array.
            // This nested loop prints the elements (squares) in each row. The inner loop assigns each element to a variable named "string" and prints it to the screen. Then it comes next to other elements by adding a space.
            // When the inner loop is complete, System.out.println() is used to move to the next line.
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------"); // This line prints a separator line indicating the end of the game board.
    }
    // The purpose of this method is to check whether the game is won or not. Returns true if the game is won and false if not.
    private boolean checkWin() {
        // Two integer variables count and mineNumber are defined. count is used to keep the number of unopened frames.
        // mineNumber is used to keep the total number of mines on the game board
        int count = 0;
        int mineNumber = 0;
        for (int i = 0; i < revealed.length; i++) {
            for (int j = 0; j < revealed[i].length; j++) { // These two loops scan the revealed array and check each frames.
                if (revealed[i][j].equals("-")) { // If the square is unopened (the "-" value), the count variable is incremented by one.
                    count++;
                }
                if (mineField[i][j].equals("*")) { // If the square indicates a mine (value "*"), the variable mineNumber is incremented by one.
                    mineNumber++;
                }
            }
        }
        // Finally, the mineNumber variable is compared with the count variable.
        // If the number of mines is not equal to the number of unopened squares, i.e. not all mines are inside the unopened squares, the value true is returned.
        // Otherwise, false is returned if all mines are inside opened squares.
        return mineNumber != count;
    }
}
