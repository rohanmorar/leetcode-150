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
    @DisplayName("Test Suite - Two Integer Sum Tests")
    public class IntListTest {
        @Test
        @Order(0)
        @DisplayName("Case 1:")
        public void testCase1() {
            int[] input = {3,4,5,6};
            int target = 7;
            ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1));
            ArrayList<Integer> actual = Solution.twoSum(input, target);
            assertThat(actual).isEqualTo(expected);
        }
        @Test
        @Order(0)
        @DisplayName("Case 2:")
        public void testCase2() {
            int[] input = {4,5,6};
            int target = 10;
            ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,2));
            ArrayList<Integer> actual = Solution.twoSum(input, target);
            assertThat(actual).isEqualTo(expected);
        }
        @Test
        @Order(0)
        @DisplayName("Case 3:")
        public void testCase3() {
            int[] input = {5,5};
            int target = 10;
            ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,1));
            ArrayList<Integer> actual = Solution.twoSum(input, target);
            assertThat(actual).isEqualTo(expected);
        }
    }
}