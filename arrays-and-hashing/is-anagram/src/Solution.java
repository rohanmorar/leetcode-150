import com.github.javaparser.utils.Pair;
import java.util.HashMap;

public class Solution {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        Pair<HashMap<Character, Integer>, HashMap<Character, Integer>> countMaps = makeCharacterCountsMaps(s, t);
        HashMap<Character, Integer> sCounts = countMaps.a, tCounts = countMaps.b;
        for (Character c : sCounts.keySet()) {
            if (!sCounts.get(c).equals(tCounts.get(c))) return false;
        }
        return true;
    }

    public static Pair<HashMap<Character, Integer>, HashMap<Character, Integer>> makeCharacterCountsMaps(String s , String t) {
        HashMap<Character, Integer> sCounts = new HashMap<>();
        HashMap<Character, Integer> tCounts = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            sCounts.put(s.charAt(i), sCounts.getOrDefault(s.charAt(i), 0) + 1);
            tCounts.put(t.charAt(i), tCounts.getOrDefault(t.charAt(i), 0) + 1);
        }
        return new Pair<>(sCounts, tCounts);
    }
}