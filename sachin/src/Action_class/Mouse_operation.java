package Action_class;
       

        import java.time.Duration;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Mouse_operation  {

			public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
				
				driver.get("https://demoqa.com/buttons");
				
				
				
				//double click using action class
				Actions as = new Actions(driver);

				//continous change the id value thats why we use dynamic xpath
				
				WebElement button = driver.findElement(By.xpath("//*[text()='Click Me']"));
				as.click(button).perform();
			    as.click(button).build().perform();
			    button.click();
				
				WebElement button1=driver.findElement(By.id("rightClickBtn"));
				as.contextClick(button1).build().perform();
				button1.click();
				
				WebElement button2=driver.findElement(By.id("doubleClickBtn"));
				as.doubleClick(button2).build().perform();
				button2.click();
				
				
				
			}

		

	}

	


