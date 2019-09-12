package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * CompareTriplets
 */
public class CompareTriplets {

   // Triplets Comparison
   // Compares triplet's elements.
   static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
      int apoints = 0, bpoints = 0;
      for (int i = 0; i < a.size(); i++) {
         if (a.get(i) > b.get(i))
            apoints++;
         else if (a.get(i) < b.get(i))
            bpoints++;
      }
      List<Integer> ans = new ArrayList<>(2);
      ans.add(apoints);
      ans.add(bpoints);
      return ans;
   }

}