package Pages;
import util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);}

    By loginButton = By.cssSelector("#login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");
    By usernameBox = By.cssSelector("#user-name");
    By passwordBox = By.cssSelector("#password");
    By productText = By.cssSelector(".title");



    public void userAtHomePage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeUsernameForUsernameField(String username) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"xytzmb");
    }

    public void writePasswordForPasswordField(String password) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"8365208");

    }

    public void correctUsernameForUsernameField(String correctUsername) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"performance_glitch_user");

    }

    public void falsePasswordForPasswordField(String falsePassword) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"ukmblk89");
    }

    public void dontMatchErrorMessage(String dontMatch) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeFalseUsername(String falseUsername) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"bvxyu");
    }

    public void writeCorrectPassword(String correctPassword) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"secret_sauce");
    }

    public void checkSuccessful() {
        elementHelper.checkVisible(productText);
    }
}