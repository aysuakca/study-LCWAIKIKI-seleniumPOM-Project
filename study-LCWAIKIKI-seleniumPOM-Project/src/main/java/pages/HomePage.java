package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    SearchBox searchBox ;
    By cartCountLocator = By.xpath("//span[@class='badge-circle']");
    By cartBagLocator = By.xpath("//a[contains(@class, 'header-dropdown-toggle') and contains(., 'Sepetim')]");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() {
        click(cartBagLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
    }
