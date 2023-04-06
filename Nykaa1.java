package webApplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa1 {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.nykaa.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions get=new Actions(driver);
		get.pause(20).moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[text()='Maybelline New York'])[1]")).click();
	}
}
