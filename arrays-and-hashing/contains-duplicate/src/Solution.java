import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static boolean containsDuplicate(ArrayList<Integer> nums){
        HashMap<Integer, Integer> intCounts = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (intCounts.get(n) != null) {
                return true;
            }
            intCounts.put(n, intCounts.getOrDefault(n, 0) + 1);
        }
        return false;
    }

//    public static void main(String[] args) {
//    }
}