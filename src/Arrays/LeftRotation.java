package Arrays;

public class LeftRotation {

    // Shifts the array to the left by d spaces.
    static int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length];
        for(int i = 0; i < a.length; i++){
            result[i] = a[(i+d)%a.length];
        }

        return result;
    }

}
