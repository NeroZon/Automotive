package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class by_tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		
 WebElement fn = driver.findElement(By.tagName("input"));
 fn.clear();
 fn.sendKeys("Team");
 
	
WebElement sn = driver.findElement(By.xpath("//input[@name='lastname']"));
sn.clear();
sn.sendKeys("work");

WebElement mn = driver.findElement(By.xpath("//input[@name='reg_email__']"));
mn.clear();
mn.sendKeys("9139863378");

WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
pw.clear();
pw.sendKeys("9139863378");

WebElement day = driver.findElement(By.id("day"));
Select d = new Select(day);
d.selectByValue("20");

WebElement month = driver.findElement(By.name("birthday_month"));
Select m = new Select(month);
m.selectByVisibleText("Apr");

WebElement year = driver.findElement(By.id("year"));
Select y = new Select(year);
y.selectByIndex(29);


WebElement button = driver.findElement(By.className("_8esa"));
button.click();


	}

}
