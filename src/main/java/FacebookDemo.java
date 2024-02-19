//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {
    WebDriver webDriver;

    public void launchBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/sudhanshuranjan/Downloads/chromedriver-mac-arm64/chromedriver");
        this.webDriver = new ChromeDriver();
        this.webDriver.get("https://www.facebook.com/");
    }

    public void login(String username, String password) {
        webDriver.findElement(By.id("email")).sendKeys(username);
        webDriver.findElement(By.name("pass")).sendKeys(password);
    }

    public static void main(String[] args) {
        FacebookDemo facebookDemo = new FacebookDemo();
        facebookDemo.launchBrowser("https://www.facebook.com/");
        facebookDemo.login("15sudhanshuranjan@gmail.com", "Game@121");
    }
}

