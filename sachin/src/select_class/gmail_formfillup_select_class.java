package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sachin1.webelement;

public class gmail_formfillup_select_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1547699031&extra_1=s%7Cc%7C293767682333%7Ce%7Cfacebook%27%7C&placement=&creative=293767682333&keyword=facebook%27&partner_id=googlesem&extra_2=campaignid%3D1547699031%26adgroupid%3D58971057836%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-362360550869%26loc_physical_ms%3D1007788%26loc_interest_ms%3D1003174%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwrZOXBhACEiwA0EoRD7187-5yCV5PMsg8IEKtJY0-iTAuM6TD21sF4tTEc3yEGFX2fb-AHxoCQ48QAvD_BwE");
		
		
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		fn.clear();
		fn.sendKeys("vrushali");
		
		
        WebElement ln = driver.findElement(By.xpath("//input[@name='lastname']"));
		ln.clear();
		ln.sendKeys("walke");
		
		WebElement no = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    no.clear();
	    no.sendKeys("9588611963");
		

	    WebElement pw = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	    pw.clear();
	    pw.sendKeys("9588611963");
	    

	    WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    
	    Select d = new Select(day);
	    d.selectByValue("12");
	    
	    
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    
	    Select m = new Select(month);
	    m.selectByVisibleText("Apr");


	   



	}

}
