import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.learnvern.com/software-testing-tutorial/terminologies-part2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		String Expected = "https://www.learnvern.com/software-testing-tutorial/terminologies-part2";
		String Actual = driver.getTitle();

		if (Expected.contains(Actual)) {

			System.out.println("learn vern site Launch sucessfully");
		} else {
			System.out.println("learn vern site Launch Unsucessfull");

		}

		driver.close();

		driver.quit();
	}

}
