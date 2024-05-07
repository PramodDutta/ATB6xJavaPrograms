package src.may.ex_07052024;

public class Lab159 {
    public static void main(String[] args) {
        // Web Automation
        openBrowser();
        testLoginPage1();
        testLoginPage("Page2");
        closeBrowser();


        openBrowser();
        testLoginPage("Page3");
        closeBrowser();


        openBrowser();
        testLoginPage("Page4");
        closeBrowser();


        openBrowser();
        testLoginPage("Page5");
        closeBrowser();


    }

    static void openBrowser() {
        System.out.println("Chrome Browser Opened");

    }

    static void closeBrowser() {
        System.out.println("Chrome Browser Closed");

    }

    static void testLoginPage1() {
        System.out.println("Testing Page 1 Opened");
    }

    static void testLoginPage(String page) {
        System.out.println("Testing ->" + page);
    }
}
