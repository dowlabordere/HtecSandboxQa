package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UseCasesPage {

    @FindBy(xpath = "//div[@class='container']/div/a[1]")
    private WebElement backButton;
    @FindBy(xpath = "//div[@class='container']/div/a[2]")
    private WebElement createUseCaseButton;

    public void backToDashboard(){
        backButton.click();
    }

    public void createUseCase(){
        createUseCaseButton.click();
    }

}
