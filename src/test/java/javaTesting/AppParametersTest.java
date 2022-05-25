package javaTesting;

import javaTesting.Resources.AppParameters;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppParametersTest {
    AppParameters appParameters = new AppParameters();
    String domain = AppParameters.DOMAIN;
    String port = AppParameters.PORT;
    String finalDomain = AppParameters.getDomain();

    @Test
    public void correctURL() {
        String expectedDomain = "127.0.0.1";

        assertEquals("Domain is " + expectedDomain, expectedDomain, domain);
    }

    @Test
    public void correctPort() {
        String expectedPort = "80";

        assertEquals("Port is " + expectedPort, expectedPort, port);
    }

    @Test
    public void correctFinalURL() {
        String expectedFinalDomain = "https://127.0.0.1:80";

        assertEquals("Final domain is " + expectedFinalDomain, expectedFinalDomain, finalDomain);
    }

    @Test
    public void singletonCorrectness() {

        AppParameters inst1 = AppParameters.getInstance();

        AppParameters inst2 = AppParameters.getInstance();

        Assert.assertTrue("Instances are the same", inst1 == inst2);

    }
}
