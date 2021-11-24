public enum Websites {
    KOTUSZKOWO("http://www.kotuszkowo.pl", "Kotuszkowo- blog o kotach"),
    ONET("https://www.onet.pl/", "Onet – Jesteś na bieżąco"),
    SIIPORTAL("https://siiportal.sii.pl", "Logowanie na koncie"),
    FILMWEB("https://www.filmweb.pl/", "Filmweb - filmy takie jak Ty!"),
    SELENIUM("https://www.selenium.dev/documentation/en/webdriver/", "WebDriver | Selenium");

    private final String webUrl;
    private final String title;

    Websites(String webUrl, String title) {
        this.webUrl = webUrl;
        this.title = title;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getTitle() {
        return title;
    }

}
