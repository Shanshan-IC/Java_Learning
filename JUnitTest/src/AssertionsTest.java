/* is using methods in assert class */

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

	@Test
	public void test() {
		String obj1 = "junit";
		String obj2 = "junit";
		String obj3 = "test";
		String obj4 = "test";
		String obj5 = null;
		boolean var1 = true;
		boolean var2 = false;
		int[] arithmetic1 = { 1, 2, 3 };
		int[] arithmetic2 = { 1, 2, 3 };

		assertEquals(obj1, obj2);//compare the value

		assertSame(obj3, obj4);//compare the same object

		assertNotSame(obj2, obj4);//compare not the same object

		assertNotNull(obj1);//object is not null

		assertNull(obj5);//object is null

		assertTrue(var1);//identify var1 is true
		assertFalse(var2);

		assertArrayEquals(arithmetic1, arithmetic2);//array is equal
	}

}