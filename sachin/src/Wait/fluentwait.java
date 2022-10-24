package Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                
		
		                     Wait<WebDriver> w = fluentwait<WebDriver>(driver).
		                    
		                     withtimeout(Duration.ofSeconds(30)).
		                     
		                     pollingevery(Duration.ofSeconds(30)).
		                     
		                     ignoring(NoSuchElementException.class);
		                 //WebDriverWait wait = new WebDriverWait(driver,30);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	}

}
//explicite wait
// webdriverwait wait = new webdriverwait ();
// wait.until(ExpectedConditions.visibilityofElementlocated(By.xpath("//div[contains(text(),'compose']")));


//fluntwait
//                          wait<webdriver>w= fluentwait<webdriver>(driver).
//                          withtimeout(Duration.ofsecond(30)).
//                          pollingevery(Duration.ofseconds(30)).
                          //ignoring(nosuchelementexception.class);

// wait<webdriver> w =fluentwait<webdriver>(driver).
// without(Duration.ofseconds(10)).
// pollingevery(Duration.ofseconds(20)).
//ignoring(Nosuchelementexception.class);