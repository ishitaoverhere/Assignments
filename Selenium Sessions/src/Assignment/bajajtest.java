package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bajajtest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //visit google
        driver.get("https://www.google.com/");
       
        
//        String title=driver.getTitle();
//        System.out.println(title);
//        
//        if(title.equals("Google")) {
//        	 System.out.println("yes");
//        }else {
//        	 System.out.println("no");
//        }
//        System.out.println(driver.getCurrentUrl()); 
         WebElement path= driver.findElement(By.xpath("//input[@name='q']"));
         path.sendKeys("Bajaj Finserv Health");
         path.sendKeys(Keys.ENTER);
         
  driver.findElement(By.xpath("//h3[contains(text(),'Bajaj Finserv Health - Your Personalized Healthcare Platform')]")).click();
  //showing error    driver.findElement(By.linkText("Bajaj Finserv Health - Your Personalized Healthcare Platform")).click();
  
//  WebElement search=  driver.findElement(By.id("searchBarInput"));
  WebElement search=driver.findElement(By.xpath("//input[@id='searchBarInput']"));
  search.sendKeys("Doctor");
  search.sendKeys(Keys.ENTER);
  
  //driver.findElement(By.cssSelector("div.css-dgynh5 > div:nth-child(5) > div.css-1lwfv71 > div > div.css-1q66mfy > div.css-apwxfg > div > div:nth-child(1) > div > a > div.css-14hwr1e > div.css-5glxer > div.css-1a5hr2q")).click();
  
  //click slot and move check page
  //driver.findElement(By.cssSelector("div.MuiGrid-container > div:nth-child(2) > div.MuiPaper-root > div.MuiCardContent-root > div.flex-column > div:nth-child(2) > div:nth-child(1) > div.slotTimeContainer > a:nth-child(1)")).click();
  //driver.findElement(By.cssSelector("#__next > div.css-h2q09c > div > div:nth-child(5) > div.docProfileContainer > section:nth-child(3) > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-3 > div:nth-child(2) > div > div.MuiCardContent-root.css-145j55m > div.flex-column > div:nth-child(2) > div:nth-child(3) > div.slotTimeContainer > a:nth-child(2) > button > span.MuiButton-label")).click();
  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[5]/div[1]/section[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/a[1]")).click();
  driver.findElement(By.xpath("//*[@id=\"searchBarWrapperContainer\"]/div/div[2]/div/div[2]/p/span[1]/span[1]")).click();
  driver.findElement(By.linkText("3:30 PM")).click();
	}
}