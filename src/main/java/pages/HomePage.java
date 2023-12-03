package pages;


import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.Test.TestBase;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class HomePage extends TestBase {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[1]")
    private MobileElement firstArticle;

    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/nav_burger_menu_img")
    private MobileElement hamburgerMenuButton;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        webDriverWait = new WebDriverWait(driver, 15);
    }

    public ArticlePage firstArticleClick() throws InterruptedException {
        Thread.sleep(1000);
        firstArticle.click();
        return new ArticlePage(driver);
    }


    public HamburgerMenuPage hamburgerMenuButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        hamburgerMenuButton.click();
        return new HamburgerMenuPage(driver);
    }

}

