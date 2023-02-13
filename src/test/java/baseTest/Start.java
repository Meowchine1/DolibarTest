package baseTest;

import browser.Browser;
import browser.BrowserPool;
import browser.BrowserType;
import exceptions.XmlConfigureException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utils.StringToEnum;
import webApplication.Application;

public class Start {
    private Browser instance;
    private BrowserType type;


    @Parameters({"BROWSER", "AUTH"})
    @BeforeClass
    public void start(String browser, boolean authorization) throws XmlConfigureException {
        type = StringToEnum.convert(browser);
        instance = BrowserPool.getInstanse(type);
        instance.initDriver();
        if(authorization){
             Application.loginPage.open();
             Application.loginPage.login("", "");
        }
    }

    @AfterClass
    public void tearDown(){
        instance.close();
    }
}
