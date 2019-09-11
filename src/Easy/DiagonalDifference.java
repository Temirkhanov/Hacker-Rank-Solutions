package Easy;

/**
 * DiagonalDifference
 */
public class DiagonalDifference {

   // Diagonal Difference
   // Given a square matrix, calculate the absolute difference between the sums of
   // its diagonals.
   public static int diagonalDifference(List<List<Integer>> arr) {
      arr.toArray();
      int sum1 = 0, sum2 = 0;
      int size = arr.size();
      for (int i = 0; i < arr.size(); i++) {
         for (int j = 0; j < arr.size(); j++) {
            if (i == j)
               sum1 += arr.get(i).get(j);
            if (i == size - j - 1)
               sum2 += arr.get(i).get(j);
         }
      }
      return Math.abs(sum1 - sum2);
   }

}