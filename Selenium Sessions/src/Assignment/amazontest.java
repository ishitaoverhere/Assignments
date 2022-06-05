package Assignment;

// import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        
	        driver.get("https://www.amazon.in ");
	        
	        driver.findElement(By.xpath("//div[@id=\"nav-tools\"]/a[2]")).click();
	        WebElement get_emailorphone=driver.findElement(By.id("ap_email"));
	        get_emailorphone.sendKeys("ishita1395.cse19@chitkara.edu.in");
	        
	        driver.findElement(By.id("continue")).submit();
	        
	        
	        WebElement get_password=driver.findElement(By.id("ap_password"));
	        get_password.sendKeys("Ishita1909#");
	        
	        driver.findElement(By.id("signInSubmit")).submit();
	        
	      WebElement select_element=  driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	      Select sel=new Select(select_element);
	      sel.selectByVisibleText("Electronics");
//	     
//	      List<WebElement> list=sel.getOptions();
//	      
//	      for(WebElement webelement:list) {
//	    	  System.out.println("options are"+webelement.getText());
//	      }
	      
	      WebElement search_box=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	      search_box.sendKeys("iPhone 12");
	      search_box.sendKeys(Keys.ENTER);
	      
	      driver.findElement(By.linkText("Apple iPhone 12 (128GB) - Black")).click();
	      
	      driver.findElement(By.xpath("//div[starts-with(@id,'addToCart_feature_div')]/div/span/span/span/input")).click();
	      driver.findElement(By.xpath("//div[@id='attach-added-to-cart-message']/div[1]/div[2]/div[3]form/span[@id='attach-sidesheet-view-cart-button']/span/input")).click();
	}

}