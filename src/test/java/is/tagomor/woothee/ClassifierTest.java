package is.tagomor.woothee;

import java.util.HashMap;
import java.util.Map;
import junit.framework.TestCase;

public class ClassifierTest extends TestCase {

    public void testParse() {
        Map<String,String> expected = new HashMap<>();
        expected.put("name", "Safari");
        expected.put("category", "pc");
        expected.put("os", "Mac OSX");
        expected.put("version", "UNKNOWN");
        expected.put("os_version","10.15.7");
        expected.put("vendor", "Apple");

        Map<String,String> actual =  Classifier.parse("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) " +
            "AppleWebKit/537" +
            ".36 (KHTML, like Gecko) " +
            "Safari/114.0.0.0 Safari/537.36");
        assertEquals(expected, actual);
    }
}