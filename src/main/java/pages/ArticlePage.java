package pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.example.Test.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ArticlePage extends TestBase {


    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/pdfOverlayMoreBtn")
    private MobileElement threeDotsButton;
    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/pdfRectCutBtn")
    private MobileElement rectangleScissorsButton;

    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/pdfCutFinalToBookmarksBtn")
    private MobileElement cutToBookmarksButton;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement popUpOkButton;
    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/pdfBackToKioskButton")
    private MobileElement backButton;
    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/pdfViewPager")
    private MobileElement page;
    @AndroidFindBy (id="de.cominto.blaetterkatalog.customer.mm:id/pdfOverlayBookmarkBtn")
    private MobileElement bookmarksButton;

    public ArticlePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        webDriverWait = new WebDriverWait(driver, 1);
    }
    public ArticlePage threeDotsButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        threeDotsButton.click();
        return this;
    }
    public ArticlePage rectangleScissorsClick() throws InterruptedException {
        Thread.sleep(1000);
        rectangleScissorsButton.click();
        return this;
    }
    public ArticlePage cutToBookmarksButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        cutToBookmarksButton.click();
        return this;
    }
    public ArticlePage popUpOkButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        popUpOkButton.click();
        return this;
    }
    public HomePage backButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        backButton.click();
        return new HomePage(driver);
    }
    public ArticlePage swipeArticle ()throws  InterruptedException{
        Thread.sleep(1000);
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(1000, 500))
                .waitAction()
                .moveTo(PointOption.point(100, 500))
                .release()
                .perform();
//
//        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
//                  "elementId",((RemoteWebElement)page).getId(),
//                "direction", "left",
//                "percent", 0.75));
        return this;
    }
    public ArticlePage bookmarksButtonClick() throws InterruptedException{
        Thread.sleep(1000);
        bookmarksButton.click();
        return this;
    }
}
