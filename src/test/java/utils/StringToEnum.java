package utils;

import browser.BrowserType;
import exceptions.XmlConfigureException;

public class StringToEnum {
    public static BrowserType convert(String browserName) throws XmlConfigureException {

        switch(browserName.toLowerCase()){
            case("chrome"):
                return BrowserType.CHROME;
            case("edge"):
                return BrowserType.EDGE;
            case("opera"):
                return BrowserType.OPERA;
            case("firefox"):
                return BrowserType.FIREFOX;
        }
        throw new XmlConfigureException("Browser parametr is undefinite");
    }

}
