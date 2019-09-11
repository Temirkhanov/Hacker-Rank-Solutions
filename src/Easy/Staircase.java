
package Easy;

/**
 * staircase
 */
public class Staircase {

   // Staircase
   // Write a program that prints a staircase of size n.
   static void staircase(int n) {
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n - i - 1; j++)
            System.out.print(" ");
         for (int k = 0; k < i + 1; k++)
            System.out.print("#");
         System.out.print("\n");
      }
   }

}