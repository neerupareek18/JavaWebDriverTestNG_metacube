package Assignment7;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment7_3 {
    WebDriver chromeDriver = new ChromeDriver();

    @Test
    public void loginDetails(){
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://practice.automationtesting.in");

        //My Account page >Login Account -> Account Details
        chromeDriver.findElement(By.linkText("My Account")).click();

        chromeDriver.findElement(By.xpath("//div/form[@class='login']/p/label[@for=\"username\"]/following-sibling::input")).sendKeys("neeru.pareek@yopmail.com");
        chromeDriver.findElement(By.xpath("//div/form[@class='register']/p/label[@for=\"password\"]/following-sibling::input")).sendKeys("Admin@12345678");
        chromeDriver.findElement(By.xpath("//input[@value=\"Login\"]")).click();

        chromeDriver.findElement(By.linkText("Account Details")).click();

        //Fill all account details
        chromeDriver.findElement(By.xpath("//input[@id=\"account_first_name\"]")).clear();
        chromeDriver.findElement(By.xpath("//input[@id=\"account_first_name\"]")).sendKeys("Neeru");

        chromeDriver.findElement(By.xpath("//input[@id=\"account_last_name\"]")).clear();
        chromeDriver.findElement(By.xpath("//input[@id=\"account_last_name\"]")).sendKeys("Pareek");

        chromeDriver.findElement(By.xpath("//input[@id=\"password_current\"]")).clear();
        chromeDriver.findElement(By.xpath("//input[@id=\"password_current\"]")).sendKeys("Admin@12345678");

        chromeDriver.findElement(By.xpath("//input[@id=\"password_1\"]")).clear();
        chromeDriver.findElement(By.xpath("//input[@id=\"password_1\"]")).sendKeys("Admin@12345678");

        chromeDriver.findElement(By.xpath("//input[@id=\"password_2\"]")).clear();
        chromeDriver.findElement(By.xpath("//input[@id=\"password_2\"]")).sendKeys("Admin@12345678");

        //Save the all Changes
        chromeDriver.findElement(By.xpath("//input[@value=\"Save changes\"]")).click();


        //Logout and ReLogin new password
        chromeDriver.findElement(By.linkText("Logout"));

        chromeDriver.findElement(By.xpath("//div/form[@class='login']/p/label[@for=\"username\"]/following-sibling::input")).sendKeys("neeru.pareek@yopmail.com");
        chromeDriver.findElement(By.xpath("//div/form[@class='register']/p/label[@for=\"password\"]/following-sibling::input")).sendKeys("Admin@12345678");
        chromeDriver.findElement(By.xpath("//input[@value=\"Login\"]")).click();


    }

    @Test
    public void closeBrowser(){
        chromeDriver.quit();
    }
}
