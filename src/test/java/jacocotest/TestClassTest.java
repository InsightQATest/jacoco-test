package jacocotest;

import com.kovalcik.jacocotest.TestClass;
import org.junit.Test;

import static org.junit.Assert.fail;

public class TestClassTest {

    @Test
    public void testHello() {
        TestClass testClass = new TestClass();
        testClass.doSomething("ok");
    }

    @Test
    public void testFail() {
        fail();
    }
}
