package Arrays;


public class MinimumSwaps {

    static void printArr(int[] a, int index, String note){
        System.out.print(note + " Index(" + index +") ");
        for(int i : a )
            System.out.print(i + " ");
        System.out.println("-----------");
    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0, temp;
        boolean flag = true;
        int i = 0;
        while(flag){
            // If arr[i] is not on it's spot, swap it to it's home (i+1)
            if(arr[i] != i+1) {
                temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp-1] = temp;
                count++;
            }
            // If newly swapped value matches the current spot
            if(arr[i] == i+1) {
                flag = false; // Assume the list is sorted now
                // Check if the list if sorted by comparing neighbors.
                // If an element on the wrong spot, point index to that element spot.
                for (int j = i + 1; j < arr.length - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        flag = true;
                        i = j;
                        break;
                    }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ar = {2, 3, 4, 1, 5,};
        System.out.println(minimumSwaps(ar));

    }

}
