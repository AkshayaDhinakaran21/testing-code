package alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		driver.switchTo().alert().sendKeys("DHARUN");
		driver.switchTo().alert().accept();
		
	}


}
