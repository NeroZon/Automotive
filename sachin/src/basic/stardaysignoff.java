package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class stardaysignoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver (); 
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.clear();
		fn.sendKeys("supriya");

		WebElement sn = driver.findElement(By.xpath("//input[@name='lastname']"));
		sn.clear();
		sn.sendKeys("walke");
		
		WebElement mn = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mn.clear();
		mn.sendKeys("9607370516");
		

		WebElement pw = driver.findElement(By.xpath("	//input[@name='reg_passwd__']"));
		pw.clear();
		pw.sendKeys("Aarohi");
		
		WebElement day = driver.findElement(By.xpath("	//select[@name='birthday_day']"));
		Select d = new Select (day);
		d.selectByValue("2");
		
		
		WebElement month = driver.findElement(By.xpath("	//select[@name='birthday_month']"));
		Select m = new Select (month);
		m.selectByVisibleText("May");
		

		WebElement year = driver.findElement(By.xpath("	//select[@name='birthday_year']"));
		Select y = new Select (year);
		y.selectByIndex(24);
		
		
		
		WebElement fm = driver.findElement(By.xpath("	//input[@value='1']	"));
		fm.click();
		
		
		WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup.click();


		}

}
