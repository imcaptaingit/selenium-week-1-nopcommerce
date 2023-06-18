package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {


    static String browser = "Edge";
    static String baseURL = "https://demo.nopcommerce.com/login?returnUrl=%2";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name !! ");
        }

        //base URL
        driver.get(baseURL);

        //Print Get title
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        //Print Current URL
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Enter email to email field
        driver.findElement(By.name("Email")).sendKeys("iamboss@gmail.com");

        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("iamboss");

        //Close the Browser
        driver.close();


    }
}
