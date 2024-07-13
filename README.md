
# Tic-Tac-Toe Game in Java

This Java program implements a console-based Tic-Tac-Toe game for two players. Players can choose their symbols ('X' or 'O') and take turns making moves on a 3x3 grid.

## Features

- **Player Options:**
  - Players can choose to be 'X' or 'O' at the beginning of each game.
  - Supports multiple rounds of gameplay until players choose to stop.

- **Board Management:**
  - The game initializes with an empty 3x3 grid.
  - Players make moves by entering row and column coordinates.
  - Validates player moves to ensure they are within bounds and on empty spaces.

- **Game Over Conditions:**
  - Detects when a player has achieved a winning combination horizontally, vertically, or diagonally.
  - Declares a draw if no more moves are possible and no player has won.

- **User Interaction:**
  - Prompts users for their moves and displays the current state of the board after each move.
  - Offers the option to play again or exit after each round.

## Edge Cases Addressed

- **Valid Input Checking:**
  - Ensures that player moves are within the valid range (0-2 for both row and column).
  - Prevents players from overwriting an already occupied space.
  - Handles non-integer inputs gracefully and prompts for re-entry.
  
- **Alternate Player Turns:**
  - Alternates turns between 'X' and 'O' after each valid move.
  
- **Game State Management:**
  - Properly resets the board and game state after each round to start a new game.
  - Manages game continuation and termination based on user input ('Y' or 'N').

- **Comprehensive Winning Checks:**
  - Checks all possible winning combinations:
    - Horizontal lines (rows).
    - Vertical lines (columns).
    - Diagonal lines (both main and anti-diagonal).
  - Immediately declares a winner upon detecting a winning condition.

- **Handling Draw Conditions:**
  - Detects when all spaces on the board are filled without any player achieving a win.
  - Declares the game as a draw and ends the round.

## Functions

- **printBoard(char[][] board):**
  - Prints the current state of the board, including separators and player moves.

- **playerMove(char[][] board, char currentPlayer, Scanner sc):**
  - Handles the logic for accepting and validating player moves.
  - Prompts players to enter their moves and updates the board accordingly.

- **checkGameOver(char[][] board, char player):**
  - Checks the board for any winning combinations for the specified player.
  - Returns true if the player has won, otherwise false.

- **isBoardFull(char[][] board):**
  - Checks if the board is completely filled with moves.
  - Returns true if the board is full (draw condition), otherwise false.

- **resetBoard(char[][] board):**
  - Resets the board to its initial empty state (' ' for all cells).
  - Called after each game to prepare for a new round.

## How to Use

1. **Setup:**
   - Clone the repository to your local machine.
   - Compile the `TicTacToe.java` file using `javac TicTacToe.java`.

2. **Run the Game:**
   - Execute the compiled Java program using `java TicTacToe`.
   - Follow the prompts on the console to play the game.

3. **Gameplay:**
   - Enter 'Y' to start playing.
   - Choose whether you want to be 'X' or 'O'.
   - Enter your moves based on the row and column indices.
   - Continue playing until a player wins or the game ends in a draw.

4. **End of Game:**
   - After each game, you will be prompted to play again ('Y' for yes, 'N' for no).
   - Exiting the game will display a thank you message.

## Example Gameplay

```
$ java TicTacToe
DO you want to play: (Y/N)
y
Do you want to be player X: (Y/N)

y
-----------
   |    |   
-----------
   |    |   
-----------
   |    |   
-----------

Player X , Enter your move: (row and column)
1 1
-----------
   |    |   
-----------
   | X  |   
-----------
   |    |   
-----------

Player O , Enter your move: (row and column)
1 2
-----------
   |    |   
-----------
   | X  | O 
-----------
   |    |   
-----------

Player X , Enter your move: (row and column)
2 2
-----------
   |    |   
-----------
   | X  | O 
-----------
   |    | X 
-----------

Player O , Enter your move: (row and column)
0 0
-----------
O  |    |   
-----------
   | X  | O 
-----------
   |    | X 
-----------

Player X , Enter your move: (row and column)
0 2
-----------
O  |    | X 
-----------
   | X  | O 
-----------
   |    | X 
-----------

Player O , Enter your move: (row and column)
1 0
-----------
O  |    | X 
-----------
O  | X  | O 
-----------
   |    | X 
-----------

Player X , Enter your move: (row and column)
2 0
Player X has won!!!!!
Do you want to play Again: (Y/N)
N
Thank you for playing.
```


Feel free to refer this and build an console app , it is the first way to start building projects. 
Btw, I'm making it for fun .. Happy coding!
