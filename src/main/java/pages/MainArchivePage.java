package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.Test.TestBase;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainArchivePage extends TestBase {
    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/dlTabBookmarks")
    private MobileElement bookmarksButton;
    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/tmgs_item_groupname_text")
    private List<MobileElement> listOfBookmarks;
    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/tmgsFilterBtnDelete")
    private MobileElement deleteButton;
    @AndroidFindBy(id = "de.cominto.blaetterkatalog.customer.mm:id/p4p_tmgs_options_delete_select_all")
    private  MobileElement selectAllButton;
    @AndroidFindBy (id = "de.cominto.blaetterkatalog.customer.mm:id/p4p_tmgs_options_delete_confirm")
    private MobileElement deleteConfirmButton;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement popUpYesButton;
    public MainArchivePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        webDriverWait = new WebDriverWait(driver, 1);
    }
    public MainArchivePage bookmarksButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        bookmarksButton.click();
        return this;
    }
    public MainArchivePage twoOfBookmarksAssert() throws InterruptedException{
        Thread.sleep(1000);
        int i = listOfBookmarks.size();
        Assert.assertEquals(2,i);
        return this;
    }
    public MainArchivePage deleteButtonCLick() throws InterruptedException {
        Thread.sleep(1000);
        deleteButton.click();
        return this;
    }
    public MainArchivePage selectAllButton() throws InterruptedException {
        Thread.sleep(1000);
        selectAllButton.click();
        return this;
    }
    public MainArchivePage deleteConfirmButtonCLick() throws InterruptedException {
        Thread.sleep(1000);
        deleteConfirmButton.click();
        return this;
    }
    public MainArchivePage popUpYesButtonClick() throws InterruptedException {
        Thread.sleep(1000);
        popUpYesButton.click();
        return this;
    }
    public MainArchivePage zeroOfBookmarksAssert() throws InterruptedException{
        Thread.sleep(5000);
        int i = listOfBookmarks.size();
        Assert.assertEquals(0,i);
        return this;
    }


}
