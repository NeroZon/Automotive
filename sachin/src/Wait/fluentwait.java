package Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                
		
		                     Wait<WebDriver> w = fluentwait<WebDriver>(driver).
		                    
		                     withtimeout(Duration.ofSeconds(30)).
		                     
		                     pollingevery(Duration.ofSeconds(30)).
		                     
		                     ignoring(NoSuchElementException.class);
		                 
	}

}
