package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.className("search-form__input-field search-form__input-field--first-wrap search-form__input-field--active");
    By submitButtonLocator = By.className("search-form__input-field search-form__input-field--second-wrap");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        click(submitButtonLocator);
    }
}