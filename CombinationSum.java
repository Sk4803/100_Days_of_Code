import java.util.*;

public class CombinationSum {
   public static List combinationSum(int[] candidates, int target) {
      List result = new ArrayList();
      Arrays.sort(candidates);
      backtrack(candidates, 0, target, new ArrayList(), result);
      return result;
   }
   public static void backtrack(int[] cand, int start, int target, List list, List result) {
      if (target < 0)
         return;
      if (target == 0)
         result.add(new ArrayList(list));
      for (int i = start; i < cand.length; i++) {
         list.add(cand[i]);
         backtrack(cand, i, target - cand[i], list, result);
         list.remove(list.size() - 1);
      }
   }
   public static void main (String args[]){
      int[] nums = {2, 3, 5};
      int target = 8;
      List output = combinationSum(nums, target);
      System.out.print(output);
   }
}
