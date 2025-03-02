import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,1,1,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2,3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {4,3,3};
    assertArrayEquals(new int[]{3,1,2}, ArrayExamples.reversed(input1));
  }

}
