package org.example.Test;

import org.junit.Test;
import pages.HomePage;

public class Tests extends TestBase {
@Test
public void addingTwoBookmarks() throws InterruptedException {
    HomePage homePage = new HomePage(driver);
    homePage
            .firstArticleClick()
            .swipeArticle()
            .threeDotsButtonClick()
            .rectangleScissorsClick()
            .cutToBookmarksButtonClick()
            .popUpOkButtonClick()
            .swipeArticle()
            .bookmarksButtonClick()
            .popUpOkButtonClick()
            .backButtonClick()
            .hamburgerMenuButtonClick()
            .mainArchiveClick()
            .bookmarksButtonClick()
            .twoOfBookmarksAssert();
}
    @Test
    public void deleteAllBookmarks() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage
                .hamburgerMenuButtonClick()
                .mainArchiveClick()
                .bookmarksButtonClick()
                .deleteButtonCLick()
                .selectAllButton()
                .deleteConfirmButtonCLick()
                .popUpYesButtonClick()
                .zeroOfBookmarksAssert();
    }
}
