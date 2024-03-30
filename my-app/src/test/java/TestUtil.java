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

  @Test
  public void test1() { 
    assertFalse(c.compute(new int[]{1})); 
  }

  @Test
  public void test2() { 
    assertFalse(c.compute(new int[]{1, 2})); 
  }

  @Test
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
  public void test4() { 
    assertTrue(c.compute(new int[]{1, 1, 1})); 
  }

}