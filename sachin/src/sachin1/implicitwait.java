package sachin1;

public class implicitwait {






import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sachin1.selenium.By;


	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = "";
		
		driver = new ChromeDriver();
		
		// launch Chrome and redirect it to the Base URL
		driver.get("https://www.facebook.com/");
		
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		
		//get the actual value of the title
		actualTitle = driver.getTitle();
		
		//compare the actual title with the expected title
		if (actualTitle.contentEquals(expectedTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
			}
			/*
			 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			 * .withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).
			 * ignoring(NoSuchElementException.class);
			 */
		
		
		//wait for to enable the create new account button to be enable;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))			
				.pollingEvery(Duration.ofSeconds(10)) 			
				.ignoring(NoSuchElementException.class);
		
		/*
		 * WebElement clickregistrationlink = wait.until(new Function<WebDriver,
		 * WebElement>(){
		 * 
		 * public WebElement apply(WebDriver driver ) {
		 * System.out.println("Inside fluent wait"); return driver.findElement(By.xpath(
		 * "//a[@data-testid='open-registration-form-button']")); } });
		 */
		WebElement ele = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		
		WebElement clickregistrationlink = wait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver driver) {
				return ele;
			}
		});
		
		//click on the registration link
		clickregistrationlink.click();
		
		//close~ browserS
		//driver.close() ;
		}



