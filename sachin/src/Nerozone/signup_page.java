package Nerozone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup_page {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://portfolio.cravitaindia.com/AniketDhavale/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		// driver.quit();

		String Expected = "https://portfolio.cravitaindia.com/AniketDhavale/";
		String Actaual = driver.getTitle();

		if (Expected.contains(Actaual))

			System.out.println("URl lanuch sucessfully");

		else
			System.out.println("URL launch unsucessfully");

		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));

		name.clear();

		name.sendKeys("sachin");

		WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Email']"));

		Email.clear();

		Email.sendKeys("sachin.walke4674@gmail.com");

		WebElement mn = driver.findElement(By.xpath("//input[@placeholder='Contact No']"));

		mn.clear();

		mn.sendKeys("9637634674");

		WebElement writeSomemessage = driver.findElement(By.xpath("//textarea[@placeholder='Message']"));

		writeSomemessage.clear();

		writeSomemessage.sendKeys("very good ");

		WebElement sbutton = driver.findElement(By.xpath("//button[@type='submit']"));

		sbutton.click();

		// textarea[@placeholder='Message']
		// input[@placeholder='Name']

		// driver.close();

		// driver.quit();

	}
}
