import static com.google.common.truth.Truth.assertWithMessage;
import static com.google.common.truth.Truth.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class SolutionTest {
    @Nested
    @DisplayName("Test 1: Integer List Tests")
    public class IntListTest {
        @Test
        @Order(0)
        @DisplayName("Test 1a: an int appears more than once in list")
        public void testIntCase1() {
            ArrayList<Integer> input1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3)); // expect True
            boolean actual1 = Solution.containsDuplicate(input1);
            boolean expected1 = true;
            assertThat(actual1).isEqualTo(expected1);
        }
        @Test
        @Order(1)
        @DisplayName("Test 1b: all ints are unique in the list")
        public void testIntCase2() {
            ArrayList<Integer> input2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); // expect False
            boolean actual2 = Solution.containsDuplicate(input2);
            boolean expected2 = false;
            assertThat(actual2).isEqualTo(expected2);
        }
    }
}
