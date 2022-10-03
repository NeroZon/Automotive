package sachin1;

import java.security.PKCS12Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.webDriver;
import org.openqa.selenium.webElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3

{


String s1="Testing";
String s2="Hub";
String s3="testing";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String s = driver.getcurrenturl();
		String s2 = driver.getTitel();
		System.out.println(s2);
		System.out.println(s);
		
		WebElement ele1 = driver.findElement(By.id("email"));
		ele1.sendkeys("sneha");
		

		WebElement ele2 = driver.findElement(By.id("pass"));
		ele2.sendkeys("123@hub");

		WebElement but1= driver.findElement(By.xpath("//button[]@type='submit'"));
		but1.click();
	}

}
