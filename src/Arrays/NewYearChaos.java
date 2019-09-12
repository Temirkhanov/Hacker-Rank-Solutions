package Arrays;

public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int spot, temp;
        int count = 0;
        // Start from the end of the line
        for(int i = q.length-1; i >= 0; i--){
            spot = i+1;
            // If current element is on the wrong spot
            if(q[i] != spot){
                // If the left spot isn't the end && the left element should be on the current position
                // Increment bribes, swap the left element with the current position
                if(((i-1) >= 0) && q[i-1] == spot){
                    count++;
                    temp = q[i-1];
                    q[i-1] = q[i];
                    q[i] = temp;
                }
                // If the 2nd spot to the left isn't the end && that element should be on the current position
                // Increment bribes by 2, move that element one by one to the right.
                else if( ((i-2) >= 0) && q[i-2] == spot){
                    count += 2;
                    q[i-2] = q[i-1];
                    q[i-1] = q[i];
                    q[i] = i+1;
                }
                // Termination case. Element bribed more than 2 times.
                else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(count);
    }

}
