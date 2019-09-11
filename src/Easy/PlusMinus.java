package Easy;

/**
 * plusminus
 */
public class PlusMinus {

   // Plus-Minus
   // Given an array of integers, calculate the fractions of its elements that are
   // positive, negative, and are zeros.
   static void plusMinus(int[] arr) {
      int positive = 0, negative = 0;
      for (int i = 0; i < arr.length; i++)
         if (arr[i] < 0)
            negative++;
         else if (arr[i] > 0)
            positive++;
      System.out.println((double) positive / arr.length);
      System.out.println((double) negative / arr.length);
      System.out.println((double) (arr.length - positive - negative) / arr.length);

   }

}