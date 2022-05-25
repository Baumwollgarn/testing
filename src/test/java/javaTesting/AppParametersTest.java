package javaTesting;

import javaTesting.Resources.AppParameters;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppParametersTest {
    AppParameters appParameters = new AppParameters();
    String domain = AppParameters.DOMAIN;
    String port = AppParameters.PORT;

    @Test
    public void appParametersTest() {

        String expectedDomain = "127.0.0.1";
        String expectedPort = "80";

        assertEquals("Domain is " + expectedDomain, expectedDomain, domain);
    }
}
