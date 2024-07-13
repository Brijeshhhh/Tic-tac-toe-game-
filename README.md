
# Tic-Tac-Toe Game in Java

This is a simple implementation of the classic Tic-Tac-Toe game in Java. It allows two players to play the game on a console-based 3x3 grid.

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

- **Game State Management:**
  - Handles multiple rounds of gameplay using a loop until players choose to exit.
  - Resets the board and necessary variables after each game to start fresh.

- **Winning Conditions:**
  - Detects all possible winning combinations (rows, columns, diagonals).
  - Declares the winner immediately upon fulfilling any winning condition.

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
Y
Do you want to be player X: (Y/N)
Y
-----------
 |   |   
-----------
 |   |   
-----------
 |   |   

Player X, Enter your move: (row and column)
1
1
-----------
 |   |   
-----------
 | X |   
-----------
 |   |   

...

Player X has won!!!!!
Do you want to play Again: (Y/N)
N
Thank you for playing.
```

---

Feel free to refer this and build an console app , it is the first way to start building projects. 
Btw, I'm making it for fun .. Happy coding!
