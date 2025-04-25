package Assignment5;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment5_3 {
    ChromeDriver chromeDriver = new ChromeDriver();

    //Launch site and get top 10 gainers and losers
    @Test
    public void top10GainersAndLosers(){
        //Launch Site
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://money.rediff.com/losers/bse/daily");

        //Top 10 Gainers
        chromeDriver.findElement(By.linkText("Gainers")).click();

        Actions actions = new Actions(chromeDriver);
        for(int i =0;i<15;i++){
        actions.keyDown(Keys.PAGE_DOWN).build().perform();
        }
        System.out.println("Top 10 Gainers");
        for(int i=1;i<=10;i++){
            System.out.println(chromeDriver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
        }
        System.out.println("\n");

        //Top 10 Losers
        chromeDriver.findElement(By.linkText("Losers")).click();

        for(int i =0;i<15;i++){
            actions.keyDown(Keys.PAGE_DOWN).build().perform();
        }
        System.out.println("Top 10 Losers");
        for(int i=1;i<=10;i++){
            System.out.println(chromeDriver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
        }


        chromeDriver.quit();
    }


    }
