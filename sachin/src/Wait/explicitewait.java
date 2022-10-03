package Wait;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitewait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// explicit wait
		WebDriverWait w = new WebDriverWait (Driver,(20));
		
		w.until(ExpectedCondition.visiblilityeof(un));
		
		un.sendkeys("admin")

	}

}
