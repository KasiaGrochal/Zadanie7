import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class StartPageTest extends TestBase {


    @ParameterizedTest
    @EnumSource(value = Websites.class, names = {"KOTUSZKOWO"})
    @DisplayName("Check start page title for kotuszkowo.pl")
    @Tag("regression")
    @Tag("kotuszkowo")
    void verifyKotuszkowoStartPageTitle(Websites websites) {
        driver.get(websites.getWebUrl());
        String actualTitle= driver.getTitle();
        assertThat(actualTitle, equalTo(websites.getTitle()));
    }

    @ParameterizedTest
    @EnumSource(value = Websites.class, names = {"ONET"})
    @DisplayName("Check start page title for onet.pl")
    @Tag("regression")
    @Tag("onet")
    void verifyOnetStartPageTitle(Websites websites) {
        driver.get(websites.getWebUrl());
        String actualTitle= driver.getTitle();
        assertThat(actualTitle, equalTo(websites.getTitle()));
    }

    @ParameterizedTest
    @EnumSource(value = Websites.class, names = {"SIIPORTAL"})
    @DisplayName("Check start page title for siiportal.pl")
    @Tag("regression")
    @Tag("siiportal")
    void verifySiiPortalStartPageTitle(Websites websites) {
        driver.get(websites.getWebUrl());
        String actualTitle= driver.getTitle();
        assertThat(actualTitle, equalTo(websites.getTitle()));
    }

    @ParameterizedTest
    @EnumSource(value = Websites.class, names = {"FILMWEB"})
    @DisplayName("Check start page title for filmweb.pl")
    @Tag("regression")
    @Tag("filmweb")
    void verifyFilmwebStartPageTitle(Websites websites) {
        driver.get(websites.getWebUrl());
        String actualTitle= driver.getTitle();
        assertThat(actualTitle, equalTo(websites.getTitle()));
    }

    @ParameterizedTest
    @EnumSource(value = Websites.class, names = {"SELENIUM"})
    @DisplayName("Check start page title for selenium.pl")
    @Tag("regression")
    @Tag("selenium")
    void verifySeleniumStartPageTitle(Websites websites) {
        driver.get(websites.getWebUrl());
        String actualTitle= driver.getTitle();
        assertThat(actualTitle, equalTo(websites.getTitle()));
    }



}
