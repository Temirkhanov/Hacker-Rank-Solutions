package Easy;

/**
 * GradingStudents
 */
public class GradingStudents {

   // Birthday Cake Candles.
   static int birthdayCakeCandles(int[] ar) {
      int h = ar[0], c = 1;
      for (int i = 1; i < ar.length; i++) {
         if (h == ar[i])
            c++;
         if (h < ar[i]) {
            c = 1;
            h = ar[i];
         }
      }
      return c;
   }
}