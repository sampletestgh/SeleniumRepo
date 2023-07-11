package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPrgm 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		//driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
   driver.findElement(By.xpath("(//a[contains(text(),'View Time-Track')]")).click();
	
	}
}
