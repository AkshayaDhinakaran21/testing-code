package alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().getImplicitWaitTimeout();
		driver.findElement(By.id("nav-search-bar-form")).sendKeys("Headphones");
		
	}

}
