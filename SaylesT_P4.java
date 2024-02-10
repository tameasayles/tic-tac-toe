import java.util.Scanner;
import java.util.Random;

public class SaylesT_P4
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random random = new Random();
     
     //game setup
     
     // Create a character variable named player and initialize it to 'X'
      char player = 'X';
   
     // Create a character variable named winner and initialize it to ' '
      char winner = ' ';
   
     // Create a two-dimensional character array called board
      char[][] board = new char[3][3];
   
     // Initialize the variable to a 3x3 grid of space characters to represent the game board
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            board[i][j] = ' ';
         }
      }
         
         
         
   }
}
