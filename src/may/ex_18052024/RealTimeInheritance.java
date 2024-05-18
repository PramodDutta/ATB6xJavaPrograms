package src.may.ex_18052024;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1 = new Test1();
        t1.setBrowser("edge",true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}

class Test1 extends BaseClass{
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}

class BaseClass {
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() {
        System.out.println("Chrome Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Open Browser!!");
    }
}
