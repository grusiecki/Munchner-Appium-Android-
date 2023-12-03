package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.Test.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HamburgerMenuPage extends TestBase {

    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/menu_btn_donwloads")
    private MobileElement mainArchiveButton;

    public HamburgerMenuPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        webDriverWait = new WebDriverWait(driver, 1);
    }
    public MainArchivePage mainArchiveClick() throws InterruptedException {
        Thread.sleep(1000);
        mainArchiveButton.click();
        return new MainArchivePage(driver);
    }
}
