package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        // Base URL
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

        //Launching the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL in to the browser
        driver.get(baseUrl);
        //Print the title of the page.
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        //Print the current Url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Print the source
        System.out.println("Page Source Code is : " + driver.getPageSource());

        //Enter the email to the email field
        driver.findElement(By.id("Email"));

        //Enter the Password to password field
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("iamboss");

        //close the browser
        driver.close();


    }
}
