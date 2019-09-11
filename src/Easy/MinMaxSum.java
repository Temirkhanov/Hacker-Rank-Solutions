package Easy;

/**
 * MinMaxSum
 */
public class MinMaxSum {

   // Mini-Max Sum
   // Given five positive integers, find the minimum and maximum values that can be
   // calculated by summing exactly four of the five integers.
   static void miniMaxSum(int[] arr) {
      long min = arr[0], max = arr[0], sum = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max)
            max = arr[i];
         if (arr[i] < min)
            min = arr[i];
         sum += arr[i];
      }
      System.out.println((sum - max) + " " + (sum - min));
   }
}