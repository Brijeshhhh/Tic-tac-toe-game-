#include <iostream>
#include <vector>
using namespace std;

void printBoard(vector<vector<char>>& board);
void playerMove(vector<vector<char>>& board, char currentPlayer);
bool checkGameOver(vector<vector<char>>& board, char player);
bool isBoardFull(vector<vector<char>>& board);
void resetBoard(vector<vector<char>>& board);

int main() {
    vector<vector<char>> board(3, vector<char>(3, ' '));

    char choice;
    bool gameOver = false;
    
    cout << "Do you want to play: (Y/N)" << endl;
    cin >> choice;

    do {
        cout << "Do you want to be player X: (Y/N)" << endl;
        char ch;
        cin >> ch;
        char player = (ch == 'y' || ch == 'Y') ? 'X' : 'O';
        char currentPlayer = player;

        while (!gameOver) {
            printBoard(board);
            playerMove(board, currentPlayer);

            if (checkGameOver(board, currentPlayer)) {
                cout << "Player " << currentPlayer << " has won!!!!!" << endl;
                gameOver = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                cout << "The game is a draw!" << endl;
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        cout << "Do you want to play again: (Y/N)" << endl;
        cin >> choice;
        if (choice == 'n' || choice == 'N') {
            cout << "Thank you for playing.." << endl;
        }
        resetBoard(board);
        gameOver = false;

    } while (choice == 'Y' || choice == 'y');

    return 0;
}

void printBoard(vector<vector<char>>& board) {
    cout << "-----------" << endl;
    for (int row = 0; row < board.size(); row++) {
        if (row > 0) {
            cout << "-----------" << endl;
        }
        for (int col = 0; col < board[row].size(); col++) {
            if (col > 0) {
                cout << " | ";
            }
            cout << board[row][col];
        }
        cout << endl;
    }
    cout << "-----------" << endl << endl;
}

void playerMove(vector<vector<char>>& board, char currentPlayer) {
    int row, col;
    while (true) {
        cout << "Player " << currentPlayer << ", Enter your move: (row and column)" << endl;
        cin >> row >> col;

        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            break;
        } else {
            cout << "Enter a valid move!" << endl;
        }
    }
}

bool checkGameOver(vector<vector<char>>& board, char player) {
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
            return true;
        }
    }
    for (int j = 0; j < 3; j++) {
        if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
            return true;
        }
    }
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
        return true;
    }
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
        return true;
    }
    return false;
}

bool isBoardFull(vector<vector<char>>& board) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == ' ') {
                return false;
            }
        }
    }
    return true;
}

void resetBoard(vector<vector<char>>& board) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = ' ';
        }
    }
}
