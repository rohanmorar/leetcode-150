import static com.google.common.truth.Truth.assertThat;

import com.github.javaparser.utils.Pair;
import edu.princeton.cs.algs4.In;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SolutionTest {
    @Nested
    @DisplayName("Test 1: String Anagram Tests")
    public class IntListTest {
        @Test
        @Order(0)
        @DisplayName("Test 1a: character counts map behaves as expected")
        public void testCase1() {
            Pair<HashMap<Character, Integer>, HashMap<Character, Integer>> p = Solution.makeCharacterCountsMaps("gabba", "ghoul");
            HashMap<Character, Integer> expectedA = new HashMap<>();
            expectedA.put('g', 1);
            expectedA.put('a', 2);
            expectedA.put('b', 2);
            assertThat(expectedA).isEqualTo(p.a);

            HashMap<Character, Integer> expectedB = new HashMap<>();
            expectedB.put('g', 1);
            expectedB.put('h', 1);
            expectedB.put('o', 1);
            expectedB.put('u', 1);
            expectedB.put('l', 1);
            assertThat(expectedB).isEqualTo(p.b);
        }
        @Test
        @Order(1)
        @DisplayName("Test 1b: a valid anagram pair")
        public void testCase2() {
            boolean actual = Solution.isAnagram("fomo", "mofo");
            boolean expected = true;
            assertThat(actual).isEqualTo(expected);
        }
        @Test
        @Order(2)
        @DisplayName("Test 1c: an invalid anagram pair")
        public void testCase3() {
            boolean actual = Solution.isAnagram("turtle", "bread");
            boolean expected = false;
            assertThat(actual).isEqualTo(expected);
        }
    }
}
