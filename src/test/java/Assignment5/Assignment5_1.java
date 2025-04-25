package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment5_1 {
    ChromeDriver chromeDriver = new ChromeDriver();

    //Write automation script to click on link ‘Element8’ on the application URL
    @Test
    public void clickElement8(){
       chromeDriver.manage().window().maximize();
       chromeDriver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

       List<WebElement> accordions = chromeDriver.findElements(By.xpath("//div[@id=\"accordionExample\"]/div[@class=\"accordion-item\"]"));
int loopCount = 1;
       for(WebElement acc: accordions){
           if(acc.findElement(By.xpath("//h2/button")).getText().contains("Elements")){
               acc.click();
               acc.findElement(By.xpath("//div/div/ul/li[8]")).click();
               Assert.assertTrue(chromeDriver.getCurrentUrl().contains("https://www.tutorialspoint.com/selenium/practice/upload-download.php"));
           break;
           }
       }

       chromeDriver.quit();
    }
}
