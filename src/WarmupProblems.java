import java.util.ArrayList;
import java.util.List;

public class WarmupProblems {

    // Time Conversion
    // Converts the 12-hour time to 24-hour format.
    static String timeConversion(String s) {
        int ss = Integer.parseInt(s.substring(0,2));
        String time = s.substring(2,8);
        if(s.contains("AM"))
            if(ss == 12)
                return "00" + time;
            else
                return "0" + ss + time;
        else if(ss < 12)
            return (ss + 12) + time;
        return ss + time;
    }

    // Triplets Comparison
    // Compares triplet's elements.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int apoints = 0, bpoints = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i))
                apoints++;
            else if(a.get(i) < b.get(i))
                bpoints++;
        }
        List<Integer> ans = new ArrayList<>(2);
        ans.add(apoints);
        ans.add(bpoints);
        return ans;
    }

    // Diagonal Difference
    // Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    public static int diagonalDifference(List<List<Integer>> arr) {
        arr.toArray();
        int sum1 = 0, sum2 = 0;
        int size = arr.size();
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(i == j)
                    sum1 += arr.get(i).get(j);
                if(i == size - j -  1)
                    sum2 += arr.get(i).get(j);
            }
        }
        return Math.abs(sum1-sum2);
    }

    // Plus-Minus
    // Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
    static void plusMinus(int[] arr) {
        int positive = 0, negative = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < 0)
                negative++;
            else if(arr[i] > 0)
                positive++;
        System.out.println((double)positive / arr.length);
        System.out.println((double)negative / arr.length);
        System.out.println((double)(arr.length - positive - negative) / arr.length);

    }

    // Staircase
    // Write a program that prints a staircase of size n.
    static void staircase(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++)
                System.out.print(" ");
            for(int k = 0; k < i+1; k++)
                System.out.print("#");
            System.out.print("\n");
        }
    }

    // Mini-Max Sum
    // Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
    static void miniMaxSum(int[] arr) {
        long min = arr[0], max = arr[0], sum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
            sum += arr[i];
        }
        System.out.println((sum-max) + " " + (sum-min));
    }

    // Birthday Cake Candles.
    static int birthdayCakeCandles(int[] ar) {
        int h = ar[0], c = 1;
        for(int i = 1; i < ar.length; i++){
            if(h == ar[i])
                c++;
            if(h < ar[i]){
                c = 1;
                h = ar[i];
            }
        }
        return c;
    }


}
