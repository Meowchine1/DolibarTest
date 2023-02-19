package tests.functionalTests;

import exceptions.PageTypeException;
import org.testng.annotations.Test;
import webApplication.ApplicationRoute;

public class TestTest {

    @Test
    public void TestingFunc() throws PageTypeException {
        ApplicationRoute.getInformationPanelPage();

    }
}
