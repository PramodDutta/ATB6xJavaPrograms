package src.may.ex_25052024.Lab210;

public enum PAGES {
    HOME("https://app.vwo.com/","homePage"),
    LOGIN("https://app.vwo.com/#login","loginPage"),
    DASHBOARD("https://app.vwo.com/dashboard","dashPage");

    String url;
    String page;
    // Home ->
    // Login -> https://app.vwo.com/login
    // Dashboard -> https://app.vwo.com/dasbhoard


    PAGES(String url, String page) {
        this.url = url;
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
