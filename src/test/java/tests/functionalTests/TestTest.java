package tests.functionalTests;

import baseTest.Start;
import exceptions.PageTypeException;
import org.testng.annotations.Test;
import webApplication.ApplicationRoute;

public class TestTest extends Start {

    @Test
    public void TestingFunc() throws PageTypeException {
        ApplicationRoute.getInformationPanelPage();

    }
}
