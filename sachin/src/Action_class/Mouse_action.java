package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch Website
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//TC1- Verify amazon Launch Successfully
		WebElement amazonlogo = driver.findElement(By.xpath("//div[@id='nav-logo']"));
		Boolean logoflag= amazonlogo.isDisplayed();
		if(logoflag)
			System.out.println("Amazon Launch Successfully");
		else
			System.out.println("Amazon Launch UNSuccessfully");
		
		//TC2- go to hellow,signin
		//mouse over on hellow,signin
		WebElement hellowsignin = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		
		//Step1---create object of Actions Class and pass the webdriver as an argument
		Actions a = new Actions(driver);
		
		//Step2---By using refernces of the Actions class object use the method witch is relevant to our purpose.
		a.moveToElement(hellowsignin);
		
		//Step3--build and perform the above actions
		a.build().perform();
		
		//TC3- Click on Signin Button
		WebElement signinbutton = driver.findElement(By.cssSelector("div[id='nav-flyout-ya-signin']"));
		signinbutton.click();
		

	}



	}

