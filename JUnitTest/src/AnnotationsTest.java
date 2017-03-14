import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class AnnotationsTest {

	private ArrayList testList;
	
	//execute only once, in the starting 
	@BeforeClass
	public static void onceExecutedBeforeAll() {
		System.out.println("@BeforeClass: onceExecutedBeforeAll");
	}
	
	//execute for each test, before executing test
	@Before
	public void executedBeforeEach() {
		testList = new ArrayList();
		System.out.println("@Before: executedBeforeEach");
	}
	
	//execute only once, in the end
	@AfterClass
	public static void onceExecutedAfterAll() {
		System.out.println("@AfterClass: onceExecutedAfterAll");
	}

	//execute for each test, after executing test
	@After
	public void executedAfterEach() {
		testList.clear();
		System.out.println("@After: executedAfterEach");
	}

	@Test
	public void EmptyCollection() {
		assertTrue(testList.isEmpty());
		System.out.println("@Test: EmptyArrayList");

	}

	@Test
	public void OneItemCollection() {
		testList.add("oneItem");
		assertEquals(1, testList.size());
		System.out.println("@Test: OneItemArrayList");
	}

	//Ignore will not be executed.
	@Ignore
	public void executionIgnored() {

		System.out.println("@Ignore: This execution is ignored");
	}
}