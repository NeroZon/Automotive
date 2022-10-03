package select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sachin1.webelement;

public class facebookformfillup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");

WebDriver driver = new ChromeDriver ();

driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805511%7Cb%7Cnew%20account%20facebook%7C&placement=&creative=550525805511&keyword=new%20account%20facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-11078521167%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI8aDe4suk-QIVMZpmAh0toQDUEAAYASAAEgLDZ_D_BwE");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));


WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
fn.clear();
fn.sendKeys("prashant");


WebElement sn = driver.findElement(By.xpath("//input[@name='lastname']"));
sn.clear();
sn.sendKeys("walke");


WebElement mo = driver.findElement(By.xpath("//input[@name='reg_email__']"));
mo.clear();
mo.sendKeys("0000000000");


WebElement pw = driver.findElement(By.xpath(" //input[@name='reg_passwd__']"));
pw.clear();
pw.sendKeys("walke");


WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));

Select d = new Select (day);
d.selectByValue("10");


WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select m = new Select (Month);
m.selectByVisibleText("Apr");

WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select y = new Select (year);
y.selectByIndex(29);

WebElement sex = driver.findElement(By.className("_8esa"));
sex.click();

WebElement submit = driver.findElement(By .xpath("//button[@id='u_0_s_j4']"));
submit.click();
//button[@id='u_0_s_j4']
		
	}

}
