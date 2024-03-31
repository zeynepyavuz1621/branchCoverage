import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test 
  public void example() { assertTrue(true); }

  @Test // to check if the parameter length is 1 are we getting false
  public void test1() { 
    assertFalse(c.compute(new int[]{1})); 
  }

  @Test // to check if the parameter length is even are we getting false
  public void test2() { 
    assertFalse(c.compute(new int[]{1, 2})); 
  }

  @Test // to check if the parameter contains 0 are we getting RuntimeException
  public void test3() { 
    try {
      c.compute(new int[]{0, 0, 0});
      fail("Expected RuntimeException was not thrown");
    } catch (RuntimeException e) {
        // Expected exception was thrown, so the test passes
        assertTrue(true);
    }
  }

  @Test
  public void test4() { // to check if the current sum could be divided the current index are we getting true
    assertTrue(c.compute(new int[]{1, 1, 1})); 
  }

  @Test
  public void test5() { // to check if the current sum could not be divided the current index anytime in the loop are we getting false
    assertFalse(c.compute(new int[]{5, 7, 5})); 
  }

}