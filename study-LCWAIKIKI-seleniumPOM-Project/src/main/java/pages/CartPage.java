package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends BasePage {

    By productNameLocator = new By.ByCssSelector("//img[@src='https://img-lcwaikiki.mncdn.com/mnpadding/600/800/ffffff/mpsellerportal/v0/img_035325667v0_42e9f0e7-38d3-4139-8c6c-2738f0a06452.jpg']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return !getProducts().isEmpty();
    }

    private List<WebElement> getProducts() {
        return findAll(productNameLocator);
    }
}