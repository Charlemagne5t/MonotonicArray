import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isMonoTonicTest1() {
        int[] nums = {1, 2, 2, 3};
        boolean actual = new Solution().isMonotonic(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void isMonoTonicTest2() {
        int[] nums = {6, 5, 4, 4};
        boolean actual = new Solution().isMonotonic(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void isMonoTonicTest3() {
        int[] nums = {1, 3, 2};
        boolean actual = new Solution().isMonotonic(nums);

        Assert.assertFalse(actual);
    }

}
