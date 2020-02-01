import junit.framework.TestCase;

public class NameCaptureTest extends TestCase {

    NameCapture nc = new NameCapture();
    public void testTestGetName() {
    assertEquals("vohra",nc.getName());

    }
}