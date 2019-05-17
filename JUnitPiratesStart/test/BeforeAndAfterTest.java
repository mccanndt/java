import static org.junit.Assert.*;

import org.junit.*;

public class BeforeAndAfterTest {

	@Test
	public void test1() {
		System.out.println("Test 1 called");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 called");
	}

	@Test
	public void test3() {
		System.out.println("Test 3 called");
	}

	@Before
	public void before() {
		System.out.println("before called");
	}

	@After
	public void after() {
		System.out.println("after called");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass called");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass called");
	}

}
