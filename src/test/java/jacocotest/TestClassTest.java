package jacocotest;

import com.kovalcik.jacocotest.TestClass;
import org.junit.Test;

public class TestClassTest {

    @Test
    public void testHello() {
        TestClass testClass = new TestClass();
        testClass.doSomething("ok");
    }
}
