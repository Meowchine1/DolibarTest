package browser;

import java.util.HashMap;

public class BrowserPool {// delete browser type
    private static final HashMap<BrowserType, Browser> browsers = new HashMap<>();

    public static Browser getInstanse(BrowserType type){
        Browser browserImpl = browsers.get(type);

        if(browserImpl == null){
            if(type.equals(BrowserType.CHROME)){
                browserImpl = new Browser(BrowserType.CHROME);
            } else if(type.equals(BrowserType.EDGE)){
                browserImpl = new Browser(BrowserType.EDGE);
            } else if(type.equals(BrowserType.FIREFOX)){
                browserImpl = new Browser(BrowserType.FIREFOX);
            }
            browsers.put(type, browserImpl);
        }
        else{
            return browserImpl;
        }
        return browserImpl;
    }

}
