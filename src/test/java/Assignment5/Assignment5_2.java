package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;

import java.util.List;

public class Assignment5_2 {
    ChromeDriver chromeDriver = new ChromeDriver();

    //Launch application and Fill following fields in the form
    @Test
    public void login(){
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        Faker faker = new Faker();

        chromeDriver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("TestName");
        chromeDriver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(faker.internet().emailAddress());
        chromeDriver.findElement(By.xpath("//input[@type=\"radio\"]/following-sibling::label[text()=\"Female\"]")).click();
        chromeDriver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9999999999");
        chromeDriver.findElement(By.xpath("//input[@name=\"dob\"]")).sendKeys("01101994");
        chromeDriver.findElement(By.xpath("//input[@name=\"subjects\"]")).sendKeys("TestSubjects");
        //Movies not there -- Selected Music
        chromeDriver.findElement(By.xpath("//label[@for=\"hobbies\"]/following-sibling::div/div/div/label[text()=\"Music\"]")).click();
        //other details in the assignment are not there on the form
        // current form asks for file upload which is not possible through selenium WebDriver
        //The form is not getting submitted even manually

        chromeDriver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        chromeDriver.quit();
    }
}
