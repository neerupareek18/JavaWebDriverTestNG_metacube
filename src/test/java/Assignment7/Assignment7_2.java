package Assignment7;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;

public class Assignment7_2 {
    WebDriver chromeDriver = new ChromeDriver();

    @Test
    public void registerAccount(){
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://practice.automationtesting.in");

        //Verify less than 8 products displayed on the My Account page
        chromeDriver.findElement(By.linkText("My Account")).click();
        //Products not visible on the page

        //Register your account
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        chromeDriver.findElement(By.xpath("//div/form[@class='register']/p/label[@for=\"reg_email\"]/following-sibling::input")).sendKeys(email);
        chromeDriver.findElement(By.xpath("//div/form[@class='register']/p/label[@for=\"reg_password\"]/following-sibling::input")).sendKeys("Admin@12345678");
        chromeDriver.findElement(By.xpath("//input[@type=\"submit\" and @name=\"register\"]")).click();

        String name = chromeDriver.findElement(By.xpath("//div[@class=\"woocommerce-MyAccount-content\"]/p/strong")).getText();

        //Verify Account should created
        Assert.assertTrue(email.contains(name));

        //Logout
        chromeDriver.findElement(By.linkText("Logout"));

         }

    @Test
    public void closeBrowser(){
        chromeDriver.quit();
    }
}
