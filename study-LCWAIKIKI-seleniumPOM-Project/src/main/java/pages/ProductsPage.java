package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By dropDownLocator = By.className("dropdown-button desktop-list-options-bar__sort-select-button");
    By productNameLocator = By.xpath("//img[@src='https://img-lcwaikiki.mncdn.com/mnpadding/600/800/ffffff/mpsellerportal/v0/img_035325667v0_42e9f0e7-38d3-4139-8c6c-2738f0a06452.jpg']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(dropDownLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}